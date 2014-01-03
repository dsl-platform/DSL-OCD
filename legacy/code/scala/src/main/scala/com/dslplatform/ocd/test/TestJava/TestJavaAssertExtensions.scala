package com.dslplatform.ocd
package test
package TestJava

object TestJavaAssertExtensions {
  def body = """package org.junit;

import org.joda.time.DateTime;
import org.joda.time.Duration;

public class AssertExtensions {
  public static void assertEquals(
      final DateTime expected,
      final DateTime actual,
      final Duration delta) {

    if (expected == null) {
      if (actual != null)
        Assert.fail("expected:<null>, but was:<" + actual + ">");
    }
    else {
      if (actual == null)
        Assert.fail("expected:<" + expected + ">, but was:<null>");
    }

    final long difference =
        Math.abs(expected.getMillis() - actual.getMillis());

    if (difference > delta.getMillis()) {
      Assert.fail("expected datetime:<" + expected +
          "> was too distant to actual datetime:<" + actual +
          "> (allowed delta was " + delta.getMillis() + "ms)");
    }
  }

  public static void assertArrayEquals(
      final boolean[] expecteds,
      final boolean[] actuals) {

    if (expecteds == null)
      Assert.fail("expected array was null");

    if (actuals == null) Assert.fail("actual array was null");

    if (expecteds.length != actuals.length)
      Assert.fail("array lengths differed, expected.length=" + expecteds.length
          + " actual.length=" + actuals.length);

    for (int i = 0; i < expecteds.length; i++) {
      final boolean b1 = expecteds[i];
      final boolean b2 = actuals[i];
      Assert.assertEquals(b1, b2);
    }
  }

  public static void assertArrayEquals(
      final Double[] expecteds,
      final Double[] actuals,
      final double delta) {

    if (expecteds == null) Assert.fail("expected array was null");

    if (actuals == null) Assert.fail("actual array was null");

    if (expecteds.length != actuals.length)
      Assert.fail("array lengths differed, expected.length=" + expecteds.length
          + " actual.length=" + actuals.length);

    for (int i = 0; i < expecteds.length; i++) {
      final Double d1 = expecteds[i];
      final Double d2 = actuals[i];
      Assert.assertEquals(d1, d2, delta);
    }
  }

  public static void assertArrayEquals(
      final Float[] expecteds,
      final Float[] actuals,
      final float delta) {

    if (expecteds == null) Assert.fail("expected array was null");

    if (actuals == null) Assert.fail("actual array was null");

    if (expecteds.length != actuals.length)
      Assert.fail("array lengths differed, expected.length=" + expecteds.length
          + " actual.length=" + actuals.length);

    for (int i = 0; i < expecteds.length; i++) {
      final Float f1 = expecteds[i];
      final Float f2 = actuals[i];
      Assert.assertEquals(f1, f2, delta);
    }
  }
}
"""
}
