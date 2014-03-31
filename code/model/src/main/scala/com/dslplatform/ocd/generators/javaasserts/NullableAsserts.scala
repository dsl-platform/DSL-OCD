package com.dslplatform.ocd.generators
package javaasserts

import Boxes._
import javas._

trait NullableAsserts { self: JavaAsserts =>
  def nullableAsserts = s"""
    private static void assert${boxName}Equals(final String message, final ${clazz} expected, final ${clazz} actual${factors.signature}) {${assertNullableEquals}
        assertSingleEquals(message, expected, actual${factors.argument});
    }

    public static void assert${boxName}Equals(final ${clazz} expected, final ${clazz} actual${factors.signature}) {
        assert${boxName}Equals("${mismatch}: ", expected, actual${factors.argument});
    }
""" + factors.method

  def assertNullableEquals = stub match {
    case JavaBinary => s"""
        if (expected == actual) return;
        if (expected == null) Assert.fail(message + "expected was <null>, but actual was a ${name} of " + actual.length + " bytes");
        if (actual == null) Assert.fail(message + "expected was a ${name} of " + expected.length + " bytes, but actual was <null>");"""

    case _ => s"""
        if (expected == actual) return;
        if (expected == null) Assert.fail(message + "expected was <null>, but actual was \\"" + actual + "\\"");
        if (actual == null) Assert.fail(message + "expected was \\"" + expected + "\\", but actual was <null>");"""
    }
}
