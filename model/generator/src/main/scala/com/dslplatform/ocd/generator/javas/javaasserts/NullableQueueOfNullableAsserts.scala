package com.dslplatform.ocd
package generator
package javas
package javaasserts

import types._
import boxes._

trait NullableQueueOfNullableAsserts { self: JavaAsserts =>
  def nullableQueueOfNullableAsserts = s"""
    private static void assert${boxName}Equals(final String message, final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {${assertNullableQueueEquals}
        assertQueueOfNullableEquals(message, expecteds, actuals${factors.argument});
    }

    public static void assert${boxName}Equals(final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {
        assert${boxName}Equals("${mismatch}: ", expecteds, actuals${factors.argument});
    }
""" + factors.method
}
