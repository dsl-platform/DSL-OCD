package com.dslplatform.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Random;

import model.CalculatedTestsFloat.TestFloat;

import org.junit.Test;

public class CalculatedTestsFloat {

  @Test
  public void maxValueToString() throws IOException {
    System.out.printf("Float [%s] -> String\n\n", Float.MAX_VALUE);

    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(Float.MAX_VALUE)
      .persist();

    assertEquals(String.valueOf(Float.MAX_VALUE), testFloat.getCalculatedStringFromFloat());
  }

  @Test
  public void minValueToString() throws IOException {
    System.out.printf("Float [%s] -> String\n\n", Float.MIN_VALUE);

    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(Float.MIN_VALUE)
      .persist();

    assertEquals(String.valueOf(Float.MIN_VALUE), testFloat.getCalculatedStringFromFloat());
  }

  @Test
  public void doubleNanToString() throws IOException {
    System.out.printf("Float [%s] -> String\n\n", Float.NaN);

    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(Float.NaN)
      .persist();

    assertEquals(String.valueOf(Float.NaN), testFloat.getCalculatedStringFromFloat());
  }

  @Test
  public void doubleNegInfinityToString() throws IOException {
    System.out.printf("Float [%s] -> String\n\n", Float.NEGATIVE_INFINITY);

    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(Float.NEGATIVE_INFINITY)
      .persist();

    assertEquals(String.valueOf(Float.NEGATIVE_INFINITY), testFloat.getCalculatedStringFromFloat());
  }

  @Test
  public void doublePosInfinityToString() throws IOException {
    System.out.printf("Float [%s] -> String\n\n", Float.POSITIVE_INFINITY);

    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(Float.POSITIVE_INFINITY)
      .persist();

    assertEquals(String.valueOf(Float.POSITIVE_INFINITY), testFloat.getCalculatedStringFromFloat());
  }

  @Test
  public void doubleZeroToString() throws IOException {
    System.out.printf("Float [0] -> String\n\n");

    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(0f)
      .persist();

    assertEquals("0", testFloat.getCalculatedStringFromFloat());
  }

  @Test
  public void doubleRandomToString() throws IOException {
    float random = (new Random()).nextFloat();
    System.out.printf("Float [%s] -> String\n\n", random);

    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(random)
      .persist();

    assertEquals(String.valueOf(random), testFloat.getCalculatedStringFromFloat());
  }

  @Test
  public void zeroToInt() throws IOException {
    System.out.printf("Float [0] -> Int\n\n");

    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(0)
      .persist();

    assertEquals(0, testFloat.getCalculatedIntFromFloat());
  }

  @Test
  public void randomToInt() throws IOException {
    float random = (new Random()).nextFloat();
    System.out.printf("Float [%s] -> Int\n\n", random);

    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(random)
      .persist();

    assertEquals((int) random, testFloat.getCalculatedIntFromFloat());
  }

  @Test
  public void maxValueToDouble() throws IOException {
    System.out.printf("Float [%s] -> Double\n\n", Float.MAX_VALUE);
    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(Float.MAX_VALUE)
      .persist();
    assertTrue((double) Float.MAX_VALUE == testFloat.getCalculatedDoubleFromFloat());
  }

  @Test
  public void minValueToDouble() throws IOException {
    System.out.printf("Float [%s] -> Double\n\n", Float.MIN_VALUE);

    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(Float.MIN_VALUE)
      .persist();

    assertEquals((double) Float.MIN_VALUE, testFloat.getCalculatedDoubleFromFloat(), 6);
  }

  @Test
  public void nanToDouble() throws IOException {
    System.out.printf("Float [%s] -> Double\n\n", Float.NaN);

    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(Float.NaN)
      .persist();

    assertEquals(Double.NaN, testFloat.getCalculatedDoubleFromFloat(), 6);
  }

  @Test
  public void doubleNegInfinityToDouble() throws IOException {
    System.out.printf("Float [%s] -> Double\n\n", Float.NEGATIVE_INFINITY);

    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(Float.NEGATIVE_INFINITY)
      .persist();

    assertTrue(Double.NEGATIVE_INFINITY == testFloat.getCalculatedDoubleFromFloat());
  }

  @Test
  public void doublePosInfinityToDouble() throws IOException {
    System.out.printf("Float [%s] -> Double\n\n", Float.POSITIVE_INFINITY);

    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(Float.POSITIVE_INFINITY)
      .persist();

    assertTrue(Double.POSITIVE_INFINITY == testFloat.getCalculatedDoubleFromFloat());
  }

  @Test
  public void zeroToDouble() throws IOException {
    System.out.printf("Float [0] -> Double\n\n");

    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(0f)
      .persist();

    assertTrue(0d == testFloat.getCalculatedDoubleFromFloat());
  }

  @Test
  public void randomToDouble() throws IOException {
    float random = (new Random()).nextFloat();
    System.out.printf("Float [%s] -> Double\n\n", random);

    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(random)
      .persist();

    assertTrue((double) random == testFloat.getCalculatedDoubleFromFloat());
  }


  @Test
  public void zeroToLong() throws IOException {
    System.out.printf("Float [0] -> Long\n\n");

    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(0f)
      .persist();

    assertEquals(0l, testFloat.getCalculatedLongFromFloat());
  }

  @Test
  public void randomToLong() throws IOException {
    float random = (new Random()).nextFloat();
    System.out.printf("Float [%s] -> Long\n\n", random);

    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(random)
      .persist();

    assertEquals((long) random, testFloat.getCalculatedLongFromFloat());
  }

  @Test
  public void randomToDecimal() throws IOException {
    float random = (new Random()).nextFloat();
    System.out.printf("Float [%s] -> Decimal\n\n", random);

    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(random)
      .persist();

    assertEquals(new BigDecimal(random), testFloat.getCalculatedDecimalFromFloat());
    assertEquals(new BigDecimal(random), testFloat.getCalculatedMoneyFromFloat());
  }

  @Test
  public void zeroToBoolean() throws IOException {
    System.out.printf("Float [0] -> Boolean\n\n");

    TestFloat testFloat = new TestFloat()
      .setOriginalFloat(0l)
      .persist();

    assertEquals(false, testFloat.getCalculatedBooleanFromFloat());
  }


}

