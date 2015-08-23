package com.dslplatform.ocd
package generator
package javas
package javaasserts

import types._
import boxes._

trait OneQueueOfNullableAsserts { self: JavaAsserts =>
  def oneQueueOfNullableAsserts = s"""
    private static void assertQueueOfNullableEquals(final String message, final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {${assertQueueOfNullableEquals}
    }

    private static void assert${boxName}Equals(final String message, final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {${assertOneQueueOfNullableEquals}
        assertQueueOfNullableEquals(message, expecteds, actuals${factors.argument});
    }

    public static void assert${boxName}Equals(final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {
        assert${boxName}Equals("${mismatch}: ", expecteds, actuals${factors.argument});
    }
""" + factors.method

  def assertQueueOfNullableEquals = s"""
        final int expectedsSize = expecteds.size();
        final int actualsSize = actuals.size();
        if (expectedsSize != actualsSize) {
            Assert.fail(message + "expecteds was a queue of size " + expectedsSize + ", but actuals was a queue of size " + actualsSize);
        }

        final java.util.Iterator<${reference}> expectedsIterator = expecteds.iterator();
        final java.util.Iterator<${reference}> actualsIterator = actuals.iterator();
        for (int i = 0; i < expectedsSize; i++) {
            final ${reference} expected = expectedsIterator.next();
            final ${reference} actual = actualsIterator.next();
            assertNullableEquals(message + "element mismatch occurred at index " + i + ": ", expected, actual${factors.argument});
        }"""

  def assertOneQueueOfNullableEquals = s"""
        if (expecteds == null) Assert.fail(message + "expecteds was <null> - WARNING: This is a preconditions failure in expecteds, this assertion will never succeed!");
        if (expecteds == actuals) return;
        if (actuals == null) Assert.fail(message + "expecteds was a queue of size " + expecteds.size() + ", but actuals was <null>");"""
}
