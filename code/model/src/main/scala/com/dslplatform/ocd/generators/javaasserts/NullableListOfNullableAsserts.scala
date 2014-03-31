package com.dslplatform.ocd.generators
package javaasserts

import Types._
import Boxes._
import javas._

trait NullableListOfNullableAsserts { self: JavaAsserts =>
  def nullableListOfNullableAsserts = s"""
    private static void assert${boxName}Equals(final String message, final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {${assertNullableListEquals}
        assertListOfNullableEquals(message, expecteds, actuals${factors.argument});
    }

    public static void assert${boxName}Equals(final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {
        assert${boxName}Equals("${mismatch}: ", expecteds, actuals${factors.argument});
    }
""" + factors.method
}
