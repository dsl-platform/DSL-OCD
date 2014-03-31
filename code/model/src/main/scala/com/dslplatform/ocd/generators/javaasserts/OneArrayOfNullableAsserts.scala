package com.dslplatform.ocd.generators
package javaasserts

import Types._
import Boxes._
import javas._

trait OneArrayOfNullableAsserts { self: JavaAsserts =>
  def oneArrayOfNullableAsserts = s"""
    private static void assertArrayOfNullableEquals(final String message, final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {${assertArrayOfNullableEquals}
    }

    private static void assert${boxName}Equals(final String message, final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {${assertOneArrayOfNullableEquals}
        assertArrayOfNullableEquals(message, expecteds, actuals${factors.argument});
    }

    public static void assert${boxName}Equals(final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {
        assert${boxName}Equals("${mismatch}: ", expecteds, actuals${factors.argument});
    }
""" + factors.method

  def assertArrayOfNullableEquals = s"""
        if (expecteds.length != actuals.length) {
            Assert.fail(message + "expecteds was an array of length " + expecteds.length + ", but actuals was an array of length " + actuals.length);
        }

        for (int i = 0; i < expecteds.length; i++) {
            assertNullableEquals(message + "element mismatch occurred at index " + i + ": ", expecteds[i], actuals[i]${factors.argument});
        }"""

  def assertOneArrayOfNullableEquals = s"""
        if (expecteds == null) Assert.fail(message + "expecteds was <null> - WARNING: This is a preconditions failure in expecteds, this assertion will never succeed!");
        if (expecteds == actuals) return;
        if (actuals == null) Assert.fail(message + "expecteds was an array of length " + expecteds.length + ", but actuals was <null>");"""
}
