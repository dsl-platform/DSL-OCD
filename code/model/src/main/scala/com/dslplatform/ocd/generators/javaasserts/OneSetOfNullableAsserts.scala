package com.dslplatform.ocd.generators
package javaasserts

import Types._
import Boxes._
import javas._

trait OneSetOfNullableAsserts { self: JavaAsserts =>
  def oneSetOfNullableAsserts = s"""
    private static void assertSetOfNullableEquals(final String message, final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {${assertSetOfNullableEquals}
    }

    private static void assert${boxName}Equals(final String message, final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {${assertOneSetOfNullableEquals}
        assertSetOfNullableEquals(message, expecteds, actuals${factors.argument});
    }

    public static void assert${boxName}Equals(final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {
        assert${boxName}Equals("${mismatch}: ", expecteds, actuals${factors.argument});
    }
""" + factors.method

  def assertSetOfNullableEquals = s"""
        final int expectedsSize = expecteds.size();
        final int actualsSize = actuals.size();
        if (expectedsSize != actualsSize) {
            Assert.fail(message + "expecteds was a set of size " + expectedsSize + ", but actuals was a set of size " + actualsSize);
        }
""" + (stub match {
    case JavaBinary | JavaDouble | JavaFloat | JavaDecimal | JavaDecimalWithScale | JavaMoney | JavaLocation | JavaRectangle | JavaTimestamp | JavaXml => s"""
        expectedsLoop: for (final ${reference} expected : expecteds) {
            if (actuals.contains(expected)) continue;
            for (final ${reference} actual : actuals) {
                try {
                    assertNullableEquals(expected, actual${factors.argument});
                    continue expectedsLoop;
                }
                catch (final AssertionError e) {}
            }
            Assert.fail(message + "actuals did not contain the expecteds element \\"" + expected + "\\"");
        }"""

    case _ => s"""
        for (final ${reference} expected : expecteds) {
            if (!actuals.contains(expected)) {
                Assert.fail(message + "actuals did not contain the expecteds element \\"" + expected + "\\"");
            }
        }"""
  })

  def assertOneSetOfNullableEquals = s"""
        if (expecteds == null) Assert.fail(message + "expecteds was <null> - WARNING: This is a preconditions failure in expecteds, this assertion will never succeed!");
        if (expecteds == actuals) return;
        if (actuals == null) Assert.fail(message + "expecteds was a set of size " + expecteds.size() + ", but actuals was <null>");"""
}
