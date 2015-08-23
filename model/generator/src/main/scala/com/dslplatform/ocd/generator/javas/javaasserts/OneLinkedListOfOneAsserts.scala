package com.dslplatform.ocd
package generator
package javas
package javaasserts

import types._
import boxes._

trait OneLinkedListOfOneAsserts { self: JavaAsserts =>
  def oneLinkedListOfOneAsserts = s"""
    private static void assertLinkedListOfOneEquals(final String message, final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {${assertLinkedListOfOneEquals}
    }

    private static void assert${boxName}Equals(final String message, final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {${assertOneLinkedListOfOneEquals}
        assertLinkedListOfOneEquals(message, expecteds, actuals${factors.argument});
    }

    public static void assert${boxName}Equals(final ${clazz} expecteds, final ${clazz} actuals${factors.signature}) {
        assert${boxName}Equals("${mismatch}: ", expecteds, actuals${factors.argument});
    }
""" + factors.method

  def assertLinkedListOfOneEquals = s"""
        final int expectedsSize = expecteds.size();
        final int actualsSize = actuals.size();
        if (expectedsSize != actualsSize) {
            Assert.fail(message + "expecteds was a linked list of size " + expectedsSize + ", but actuals was a linked list of size " + actualsSize);
        }

        final java.util.Iterator<${reference}> expectedsIterator = expecteds.iterator();
        final java.util.Iterator<${reference}> actualsIterator = actuals.iterator();
        for (int i = 0; i < expectedsSize; i++) {
            final ${reference} expected = expectedsIterator.next();
            final ${reference} actual = actualsIterator.next();${isPrimitive.ifTrue(s"""
            if (actual == null) {
                Assert.fail(message + "element mismatch occurred at index " + i + ": expected was \\"" + expected + "\\", but actual was <null>");
            }""")}
            assertOneEquals(message + "element mismatch occurred at index " + i + ": ", expected${primitiveValue}, actual${primitiveValue}${factors.argument});
        }"""

  def assertOneLinkedListOfOneEquals = s"""
        int i = 0;
        for (final ${reference} expected : expecteds) {
            if (expected == null) {
                Assert.fail(message + "element mismatch occurred at index " + i + ": expected was <null> - WARNING: This is a preconditions failure in expected, this assertion will never succeed!");
            }
            i++;
        }
        if (expecteds == actuals) return;
        if (actuals == null) Assert.fail(message + "expecteds was a linked list of size " + expecteds.size() + ", but actuals was <null>");"""
}
