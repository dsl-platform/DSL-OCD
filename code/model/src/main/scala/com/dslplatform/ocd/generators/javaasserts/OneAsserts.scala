package com.dslplatform.ocd.generators
package javaasserts

import Types._
import Boxes._
import javas._

trait OneAsserts { self: JavaAsserts =>
  def oneAsserts = s"""
    static void assertSingleEquals(final String message, final ${clazz} expected, final ${clazz} actual${factors.signature}) {${assertSingleEquals}
    }

    static void assert${boxName}Equals(final String message, final ${clazz} expected, final ${clazz} actual${factors.signature}) {${assertOneEquals}
        assertSingleEquals(message, expected, actual${factors.argument});
    }

    public static void assert${boxName}Equals(final ${clazz} expected, final ${clazz} actual${factors.signature}) {
        assert${boxName}Equals("${mismatch}: ", expected, actual${factors.argument});
    }
""" + factors.method

  def assertSingleEquals = stub match {
    case JavaBinary => s"""
        if (expected.length != actual.length) {
            Assert.fail(message + "expected was a ${name} of " + expected.length + " bytes, but actual was a ${name} of " + actual.length + " bytes");
        }

        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != actual[i]) {
                Assert.fail(message + "${name} differs at index " + i + ": expected was \\"" + expected[i] + "\\", but actual was \\"" + actual[i] + "\\"");
            }
        }"""

    case JavaFloat | JavaDouble => s"""
        if (expected == actual) return;

        if (ulps == 0) {
            if (${factors.rawConverter}(expected) == ${factors.rawConverter}(actual)) return;
            Assert.fail(message + "expected was \\"" + expected + "\\", but actual was \\"" + actual + "\\" - WARNING: You are comparing the bits of ${clazz} values - not using an epsilon value!");
        }

        final ${clazz} epsilon = Math.ulp(expected) * Math.abs(ulps);
        if (expected >= actual - epsilon && expected <= actual + epsilon) return;
        Assert.fail(message + "expected was \\"" + expected + "\\", but actual was \\"" + actual + "\\" (using epsilon value of \\"" + epsilon + "\\")");"""

    case JavaDecimalWithScale => s"""
        if (expected.scale() > ${DecimalScaleConstraint}) {
            Assert.fail(message + "expected was a ${name}, but its scale was " + expected.scale() + " - WARNING: This is a preconditions failure in expected, this assertion will never succeed!");
        }

        if (actual.scale() > ${DecimalScaleConstraint}) {
            Assert.fail(message + "actual was a ${name}, but its scale was " + actual.scale());
        }

        if (expected == actual || expected.equals(actual)) return;
        Assert.fail(message + "expected was \\"" + expected + "\\", but actual was \\"" + actual + "\\"");"""

    case JavaLocation => s"""
        FloatAsserts.assertOneEquals(message + ": comparing X coordinate: ", (float) expected.getX(), (float) actual.getX()${factors.argument});
        FloatAsserts.assertOneEquals(message + ": comparing Y coordinate: ", (float) expected.getY(), (float) actual.getY()${factors.argument});"""

    case JavaRectangle => s"""
        FloatAsserts.assertOneEquals(message + ": comparing X coordinate: ", (float) expected.getX(), (float) actual.getX()${factors.argument});
        FloatAsserts.assertOneEquals(message + ": comparing Y coordinate: ", (float) expected.getY(), (float) actual.getY()${factors.argument});
        FloatAsserts.assertOneEquals(message + ": comparing width: ", (float) expected.getWidth(), (float) actual.getWidth()${factors.argument});
        FloatAsserts.assertOneEquals(message + ": comparing height: ", (float) expected.getHeight(), (float) actual.getHeight()${factors.argument});"""

    case JavaMap => s"""
        if (expected.containsKey(null)) {
            Assert.fail(message + "expected contained a <null> key - WARNING: This is a preconditions failure in expected, this assertion will never succeed!");
        }

        if (actual.containsKey(null)) {
            Assert.fail(message + "actual contained a <null> key");
        }

        if (expected.equals(actual)) return;
        Assert.fail(message + "expected was \\"" + expected + "\\", but actual was \\"" + actual + "\\"");"""

    case JavaMoney => s"""
        if (expected.scale() > ${MoneyScaleConstraint}) {
            Assert.fail(message + "expected was a ${name} with scale of ${MoneyScaleConstraint}, but its scale was " + expected.scale() + " - WARNING: This is a preconditions failure in expected, this assertion will never succeed!");
        }

        if (actual.scale() > ${MoneyScaleConstraint}) {
            Assert.fail(message + "actual was a ${name} with scale of ${MoneyScaleConstraint}, but its scale was " + actual.scale());
        }

        if (expected == actual || expected.equals(actual)) return;
        Assert.fail(message + "expected was \\"" + expected + "\\", but actual was \\"" + actual + "\\"");"""

    case JavaStringWithMaxLength => s"""
        if (expected.length() > ${StringLengthConstraint}) {
            Assert.fail(message + "expected was a ${name}, but its length was " + expected.length() + " - WARNING: This is a preconditions failure in expected, this assertion will never succeed!");
        }

        if (actual.length() > ${StringLengthConstraint}) {
            Assert.fail(message + "actual was a ${name}, but its length was " + actual.length());
        }

        if (expected == actual || expected.equals(actual)) return;
        Assert.fail(message + "expected was \\"" + expected + "\\", but actual was \\"" + actual + "\\"");"""


    case JavaTimestamp => s"""
        if (delta == org.joda.time.Duration.ZERO) {
            Assert.fail(message + "expected was \\"" + expected + "\\", but actual was \\"" + actual + "\\" - WARNING: You are comparing exact instants - not using a delta duration!");
        }

        if (expected.isBefore(actual) && expected.plus(delta).isAfter(actual)) return;
        Assert.fail(message + "expected was \\"" + expected + "\\", but actual was \\"" + actual + "\\" (using delta duration of \\"" + delta + "\\")");"""

    case JavaXml => s"""
        if (expected == actual) return;

        final String expectedString = com.dslplatform.ocd.test.Utils.elementToString(expected);
        final String actualString = com.dslplatform.ocd.test.Utils.elementToString(actual);

        if (expectedString.equals(actualString)) return;
        Assert.fail(message + "expected was \\"" + expectedString + "\\", but actual was \\"" + actualString + "\\"");"""

    case _ if isPrimitive => s"""
        if (expected == actual) return;
        Assert.fail(message + "expected was \\"" + expected + "\\", but actual was \\"" + actual + "\\"");"""

    case _ => s"""
        if (expected.equals(actual)) return;
        Assert.fail(message + "expected was \\"" + expected + "\\", but actual was \\"" + actual + "\\"");"""
  }

  def assertOneEquals = stub match {
    case JavaBinary => s"""
        if (expected == null) Assert.fail(message + "expected was <null> - WARNING: This is a preconditions failure in expected, this assertion will never succeed!");
        if (expected == actual) return;
        if (actual == null) Assert.fail(message + "expected was a ${name} of " + expected.length + " bytes, but actual was <null>");"""

    case _ if isPrimitive => ""

    case _ => s"""
        if (expected == null) Assert.fail(message + "expected was <null> - WARNING: This is a preconditions failure in expected, this assertion will never succeed!");
        if (expected == actual) return;
        if (actual == null) Assert.fail(message + "expected was \\"" + expected + "\\", but actual was <null>");"""
  }
}
