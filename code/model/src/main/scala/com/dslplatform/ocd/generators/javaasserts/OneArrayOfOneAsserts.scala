package com.dslplatform.ocd.generators
package javaasserts

import Types._
import Boxes._
import javas._

trait OneArrayOfOneAsserts { self: JavaAsserts =>
  def oneArrayOfOneAsserts = s"""
    private static void assertArrayOfOneEquals(final String message, final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {${assertArrayOfOneEquals}
    }

    private static void assert${boxName}Equals(final String message, final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {${assertOneArrayOfOneEquals}
        assertArrayOfOneEquals(message, expecteds, actuals${factors.argument});
    }

    public static void assert${boxName}Equals(final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {
        assert${boxName}Equals("${mismatch}: ", expecteds, actuals${factors.argument});
    }
""" + factors.method

  def assertArrayOfOneEquals = s"""
        if (expecteds.length != actuals.length) {
            Assert.fail(message + "expecteds was an array of length " + expecteds.length + ", but actuals was an array of length " + actuals.length);
        }

        for (int i = 0; i < expecteds.length; i++) {
            assertOneEquals(message + "element mismatch occurred at index " + i + ": ", expecteds[i], actuals[i]${factors.argument});
        }"""

  def assertOneArrayOfOneEquals = stub match {
    case _ if isPrimitive => s"""
        if (expecteds == null) Assert.fail(message + "expecteds was <null> - WARNING: This is a preconditions failure in expecteds, this assertion will never succeed!");
        if (expecteds == actuals) return;
        if (actuals == null) Assert.fail(message + "expecteds was an array of length " + expecteds.length + ", but actuals was <null>");"""

    case _ => s"""
        if (expecteds == null) Assert.fail(message + "expecteds was <null> - WARNING: This is a preconditions failure in expecteds, this assertion will never succeed!");
        for (int i = 0; i < expecteds.length; i ++) {
            if (expecteds[i] == null) {
                Assert.fail(message + "expecteds contained a <null> element at index " + i + " - WARNING: This is a preconditions failure in expecteds, this assertion will never succeed!");
            }
        }
        if (expecteds == actuals) return;
        if (actuals == null) Assert.fail(message + "expecteds was an array of length " + expecteds.length + ", but actuals was <null>");"""
  }
}
