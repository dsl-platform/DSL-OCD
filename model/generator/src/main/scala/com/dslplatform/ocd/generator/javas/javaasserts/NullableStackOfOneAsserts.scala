package com.dslplatform.ocd
package generator
package javas
package javaasserts

import types._
import boxes._

trait NullableStackOfOneAsserts { self: JavaAsserts =>
  def nullableStackOfOneAsserts = s"""
    private static void assert${boxName}Equals(final String message, final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {${assertNullableStackEquals}
        assertStackOfOneEquals(message, expecteds, actuals${factors.argument});
    }

    public static void assert${boxName}Equals(final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {
        assert${boxName}Equals("${mismatch}: ", expecteds, actuals${factors.argument});
    }
""" + factors.method

  def assertNullableStackEquals = s"""
        if (expecteds == actuals) return;
        if (expecteds == null) Assert.fail(message + "expecteds was <null>, but actuals was a stack of size " + actuals.size());
        if (actuals == null) Assert.fail(message + " expecteds was a stack of size " + expecteds.size() + ", but actuals was <null>");"""
}
