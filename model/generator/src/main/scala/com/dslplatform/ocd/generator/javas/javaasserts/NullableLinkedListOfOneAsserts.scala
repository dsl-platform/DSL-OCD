package com.dslplatform.ocd
package generator
package javas
package javaasserts

import types._
import boxes._

trait NullableLinkedListOfOneAsserts { self: JavaAsserts =>
  def nullableLinkedListOfOneAsserts = s"""
    private static void assert${boxName}Equals(final String message, final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {${assertNullableLinkedListEquals}
        assertLinkedListOfOneEquals(message, expecteds, actuals${factors.argument});
    }

    public static void assert${boxName}Equals(final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {
        assert${boxName}Equals("${mismatch}: ", expecteds, actuals${factors.argument});
    }
""" + factors.method

  def assertNullableLinkedListEquals = s"""
        if (expecteds == actuals) return;
        if (expecteds == null) Assert.fail(message + "expecteds was <null>, but actuals was a linked list of size " + actuals.size());
        if (actuals == null) Assert.fail(message + " expecteds was a linked list of size " + expecteds.size() + ", but actuals was <null>");"""
}
