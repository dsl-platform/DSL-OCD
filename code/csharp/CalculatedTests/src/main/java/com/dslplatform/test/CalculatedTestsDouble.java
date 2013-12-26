package com.dslplatform.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Random;

import model.CalculatedTestsDouble.TestDouble;

import org.junit.Test;

public class CalculatedTestsDouble {

  @Test
  public void maxValueToString() throws IOException {
    System.out.printf("Double [%s] -> String\n\n", Double.MAX_VALUE);

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble(Double.MAX_VALUE)
      .persist();

    assertEquals(String.valueOf(Double.MAX_VALUE), testDouble.getCalculatedStringFromDouble());
  }

  @Test
  public void minValueToString() throws IOException {
    System.out.printf("Double [%s] -> String\n\n", Double.MIN_VALUE);

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble(Double.MIN_VALUE)
      .persist();

    assertEquals(String.valueOf(Double.MIN_VALUE), testDouble.getCalculatedStringFromDouble());
  }

  @Test
  public void doubleNanToString() throws IOException {
    System.out.printf("Double [%s] -> String\n\n", Double.NaN);

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble(Double.NaN)
      .persist();

    assertEquals(String.valueOf(Double.NaN), testDouble.getCalculatedStringFromDouble());
  }

  @Test
  public void doubleNegInfinityToString() throws IOException {
    System.out.printf("Double [%s] -> String\n\n", Double.NEGATIVE_INFINITY);

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble(Double.NEGATIVE_INFINITY)
      .persist();

    assertEquals(String.valueOf(Double.NEGATIVE_INFINITY), testDouble.getCalculatedStringFromDouble());
  }

  @Test
  public void doublePosInfinityToString() throws IOException {
    System.out.printf("Double [%s] -> String\n\n", Double.POSITIVE_INFINITY);

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble(Double.POSITIVE_INFINITY)
      .persist();

    assertEquals(String.valueOf(Double.POSITIVE_INFINITY), testDouble.getCalculatedStringFromDouble());
  }

  @Test
  public void doubleZeroToString() throws IOException {
    System.out.printf("Double [0] -> String\n\n");

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble(0)
      .persist();

    assertEquals("0", testDouble.getCalculatedStringFromDouble());
  }

  @Test
  public void doubleRandomToString() throws IOException {
    double random = Math.random();
    System.out.printf("Double [%s] -> String\n\n", random);

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble(random)
      .persist();

    assertEquals(String.valueOf(random), testDouble.getCalculatedStringFromDouble());
  }

  @Test
  public void maxValueToInt() throws IOException {
    System.out.printf("Double [%s] -> Int\n\n", (double) Integer.MAX_VALUE);
    TestDouble testDouble = new TestDouble()
      .setOriginalDouble((double) Integer.MAX_VALUE)
      .persist();
    assertEquals(Integer.MAX_VALUE, testDouble.getCalculatedIntFromDouble());

  }

  @Test
  public void minValueToInt() throws IOException {
    System.out.printf("Double [%s] -> Int\n\n", (double) Integer.MIN_VALUE);

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble((double) Integer.MIN_VALUE)
      .persist();

    assertEquals( Integer.MIN_VALUE, testDouble.getCalculatedIntFromDouble());
  }

  @Test
  public void zeroToInt() throws IOException {
    System.out.printf("Double [0] -> Int\n\n");

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble(0)
      .persist();

    assertEquals(0, testDouble.getCalculatedIntFromDouble());
  }

  @Test
  public void randomToInt() throws IOException {
    double random = Math.random();
    System.out.printf("Double [%s] -> Int\n\n", random);

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble(random)
      .persist();

    assertEquals((int) random, testDouble.getCalculatedIntFromDouble());
  }

  @Test
  public void maxValueToFloat() throws IOException {
    System.out.printf("Double [%s] -> Float\n\n", Float.MAX_VALUE);
    TestDouble testDouble = new TestDouble()
      .setOriginalDouble((double) Float.MAX_VALUE)
      .persist();
    assertTrue(Float.MAX_VALUE == testDouble.getCalculatedFloatFromDouble());
  }

  @Test
  public void minValueToFloat() throws IOException {
    System.out.printf("Double [%s] -> Float\n\n", Float.MIN_VALUE);

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble((double) Float.MIN_VALUE)
      .persist();

    assertTrue(Float.MIN_VALUE == testDouble.getCalculatedFloatFromDouble());
  }

  @Test
  public void doubleNanToFloat() throws IOException {
    System.out.printf("Double [%s] -> Float\n\n", Double.NaN);

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble(Float.NaN)
      .persist();

    assertEquals(String.valueOf(Double.NaN), testDouble.getCalculatedStringFromDouble());
  }

  @Test
  public void doubleNegInfinityToFloat() throws IOException {
    System.out.printf("Double [%s] -> Float\n\n", Float.NEGATIVE_INFINITY);

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble((double) Float.NEGATIVE_INFINITY)
      .persist();

    assertTrue(Float.NEGATIVE_INFINITY == testDouble.getCalculatedFloatFromDouble());
  }

  @Test
  public void doublePosInfinityToFloat() throws IOException {
    System.out.printf("Double [%s] -> Float\n\n", Float.POSITIVE_INFINITY);

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble(Double.POSITIVE_INFINITY)
      .persist();

    assertTrue(Float.POSITIVE_INFINITY == testDouble.getCalculatedFloatFromDouble());
  }

  @Test
  public void doubleZeroToFloat() throws IOException {
    System.out.printf("Double [0] -> Float\n\n");

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble(0d)
      .persist();

    assertTrue(0f == testDouble.getCalculatedFloatFromDouble());
  }

  @Test
  public void doubleRandomToFloat() throws IOException {
    double random = (double) (new Random()).nextFloat();
    System.out.printf("Double [%s] -> Float\n\n", random);

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble(random)
      .persist();

    assertTrue((float) random == testDouble.getCalculatedFloatFromDouble());
  }


  @Test
  public void zeroToLong() throws IOException {
    System.out.printf("Double [0] -> Long\n\n");

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble(0)
      .persist();

    assertEquals(0l, testDouble.getCalculatedLongFromDouble());
  }

  @Test
  public void randomToLong() throws IOException {
    double random = Math.random();
    System.out.printf("Double [%s] -> Long\n\n", random);

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble(random)
      .persist();

    assertEquals((long) random, testDouble.getCalculatedLongFromDouble());
  }

  @Test
  public void randomToDecimal() throws IOException {
    double random = Math.random();
    System.out.printf("Double [%s] -> Decimal\n\n", random);

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble(random)
      .persist();

    assertEquals(new BigDecimal(random), testDouble.getCalculatedDecimalFromDouble());
    assertEquals(new BigDecimal(random), testDouble.getCalculatedMoneyFromDouble());
  }

  @Test
  public void zeroToBoolean() throws IOException {
    System.out.printf("Double [0] -> Boolean\n\n");

    TestDouble testDouble = new TestDouble()
      .setOriginalDouble(0d)
      .persist();

    assertEquals(false, testDouble.getCalculatedBooleanFromDouble());
  }


}
