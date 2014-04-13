package com.dslplatform.ocd
package generator
package javas
package javaasserts

import types._
import boxes._

import javatypes._

trait OneSetOfOneAsserts { self: JavaAsserts =>
  def oneSetOfOneAsserts = s"""
    private static void assertSetOfOneEquals(final String message, final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {${assertSetOfOneEquals}
    }

    private static void assert${boxName}Equals(final String message, final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {${assertOneSetOfOneEquals}
        assertSetOfOneEquals(message, expecteds, actuals${factors.argument});
    }

    public static void assert${boxName}Equals(final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {
        assert${boxName}Equals("${mismatch}: ", expecteds, actuals${factors.argument});
    }
""" + factors.method

  def assertSetOfOneEquals = s"""
        if (actuals.contains(null)) {
            Assert.fail(message + "actuals contained a <null> element");
        }

        final int expectedsSize = expecteds.size();
        final int actualsSize = actuals.size();
        if (expectedsSize != actualsSize) {
            Assert.fail(message + "expecteds was a set of size " + expectedsSize + ", but actuals was a set of size " + actualsSize);
        }
""" + (stub match {
    case JavaBinary | JavaDouble | JavaFloat | JavaDecimal | JavaDecimalWithScale | JavaImage | JavaMoney | JavaLocation | JavaRectangle | JavaTimestamp | JavaXml => s"""
        expectedsLoop: for (final ${reference} expected : expecteds) {
            if (actuals.contains(expected)) continue;
            for (final ${reference} actual : actuals) {
                try {
                    assertOneEquals(expected${primitiveValue}, actual${primitiveValue}${factors.argument});
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

  def assertOneSetOfOneEquals = s"""
        if (expecteds.contains(null)) {
            Assert.fail(message + "expecteds contained a <null> element - WARNING: This is a preconditions failure in expected, this assertion will never succeed!");
        }
        if (expecteds == actuals) return;
        if (actuals == null) Assert.fail(message + "expecteds was a set of size " + expecteds.size() + ", but actuals was <null>");"""
}
