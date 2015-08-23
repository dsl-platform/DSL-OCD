package com.dslplatform.ocd
package generator
package javas
package javaasserts

import types._
import boxes._

trait NullableVectorOfOneAsserts { self: JavaAsserts =>
  def nullableVectorOfOneAsserts = s"""
    private static void assert${boxName}Equals(final String message, final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {${assertNullableVectorEquals}
        assertVectorOfOneEquals(message, expecteds, actuals${factors.argument});
    }

    public static void assert${boxName}Equals(final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {
        assert${boxName}Equals("${mismatch}: ", expecteds, actuals${factors.argument});
    }
""" + factors.method

  def assertNullableVectorEquals = s"""
        if (expecteds == actuals) return;
        if (expecteds == null) Assert.fail(message + "expecteds was <null>, but actuals was a vector of size " + actuals.size());
        if (actuals == null) Assert.fail(message + " expecteds was a vector of size " + expecteds.size() + ", but actuals was <null>");"""
}
