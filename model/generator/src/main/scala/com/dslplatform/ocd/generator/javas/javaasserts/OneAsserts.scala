package com.dslplatform.ocd
package generator
package javas
package javaasserts

import types._
import boxes._

import javatypes._
import TypeDefaults._

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
        if (${factors.rawConverter}(expected) == ${factors.rawConverter}(actual)) return;

        if (ulps == 0) {
            Assert.fail(message + "expected was \\"" + expected + "\\", but actual was \\"" + actual + "\\" - WARNING: You are comparing the bits of ${clazz} values - not using an epsilon value!");
        }

        final ${clazz} epsilon = Math.ulp(expected) * Math.abs(ulps);
        if (expected >= actual - epsilon && expected <= actual + epsilon) return;
        Assert.fail(message + "expected was \\"" + expected + "\\", but actual was \\"" + actual + "\\" (using epsilon value of \\"" + epsilon + "\\")");"""

    case JavaDecimal => s"""
        if (expected == actual || expected.compareTo(actual) == 0) return;
        Assert.fail(message + "expected was \\"" + expected + "\\", but actual was \\"" + actual + "\\"");"""

    case JavaDecimalWithScale => s"""
        try {
            expected.setScale(${DefaultDecimalScale});
        }
        catch (final ArithmeticException e) {
            Assert.fail(message + "expected was a DecimalWithScaleOf9, but its scale was " + expected.scale() + " - WARNING: This is a preconditions failure in expected, this assertion will never succeed!");
        }

        try {
            expected.setScale(${DefaultDecimalScale});
        }
        catch (final ArithmeticException e) {
            Assert.fail(message + "actual was a DecimalWithScaleOf9, but its scale was " + actual.scale());
        }

        if (expected == actual || expected.compareTo(actual) == 0) return;
        Assert.fail(message + "expected was \\"" + expected + "\\", but actual was \\"" + actual + "\\"");"""

    case JavaImage => s"""
        IntegerAsserts.assertSingleEquals(message + "comparing image width: ", expected.getWidth(), actual.getWidth());
        IntegerAsserts.assertSingleEquals(message + "comparing image height: ", expected.getHeight(), actual.getHeight());

        final int[] expectedRaster = expected.getRGB(0, 0, expected.getWidth(), expected.getHeight(), null, 0, expected.getWidth());
        final int[] actualRaster = actual.getRGB(0, 0, actual.getWidth(), actual.getHeight(), null, 0, actual.getWidth());
        if (java.util.Arrays.equals(expectedRaster, actualRaster)) return;

        Assert.fail(message + "image dimensions were identical, but pixel values are different");"""

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
        try {
            expected.setScale(2);
        }
        catch (final ArithmeticException e) {
            Assert.fail(message + "expected was a DecimalWithScaleOf9, but its scale was " + expected.scale() + " - WARNING: This is a preconditions failure in expected, this assertion will never succeed!");
        }

        try {
            expected.setScale(2);
        }
        catch (final ArithmeticException e) {
            Assert.fail(message + "actual was a DecimalWithScaleOf9, but its scale was " + actual.scale());
        }

        if (expected == actual || expected.compareTo(actual) == 0) return;
        Assert.fail(message + "expected was \\"" + expected + "\\", but actual was \\"" + actual + "\\"");"""

    case JavaStringWithMaxLength => s"""
        if (expected.length() > ${DefaultStringLength}) {
            Assert.fail(message + "expected was a ${name}, but its length was " + expected.length() + " - WARNING: This is a preconditions failure in expected, this assertion will never succeed!");
        }

        if (actual.length() > ${DefaultStringLength}) {
            Assert.fail(message + "actual was a ${name}, but its length was " + actual.length());
        }

        if (expected == actual || expected.equals(actual)) return;
        Assert.fail(message + "expected was \\"" + expected + "\\", but actual was \\"" + actual + "\\"");"""


    case JavaTimestamp => s"""
        // TODO: Chronologies will not be compared if milliseconds were an exact match
        final boolean EXACT_MILLIS_GOOD_ENOUGH = true;

        if (delta == org.joda.time.Duration.ZERO) {
            if (expected == actual || expected.equals(actual)) return;

            final StringBuilder failMsg = new StringBuilder(message)
                    .append("expected was: \\"")
                    .append(expected)
                    .append("\\", but actual was: \\"")
                    .append(actual)
                    .append("\\" [WARNING - not using a delta duration, comparing two instants directly]");

            if (expected != null && actual != null) {
                if (expected.getMillis() == actual.getMillis()) {
                    if (EXACT_MILLIS_GOOD_ENOUGH) return;

                    if (org.joda.time.field.FieldUtils.equals(expected.getChronology(), actual.getChronology())) return;
                    failMsg.append("; Chronologies: ")
                            .append(expected.getChronology()).append(" vs. ")
                            .append(actual.getChronology());
                } else {
                    failMsg.append("; Millis: ").append(expected.getMillis())
                            .append(" vs. ").append(actual.getMillis());
                }
            }

            if (expected.getChronology() != null && actual.getChronology() != null) {
                if (expected.getChronology().getZone().getOffset(0) == actual.getChronology().getZone().getOffset(0)) return;
                failMsg.append("; Chronology offsets: ")
                        .append(expected.getChronology().getZone().getOffset(0))
                        .append(" vs. ")
                        .append(actual.getChronology().getZone().getOffset(0));
            } else {
                failMsg.append("; One of the chronologies is null. ");
            }

            Assert.fail(failMsg.toString());
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
