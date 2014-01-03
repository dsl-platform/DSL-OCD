package com.dslplatform.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Random;

import model.CalculatedTestsInt.TestInt;

import org.junit.Test;

public class CalculatedTestsInt {
  @Test
  public void minToString() throws IOException {
    System.out.printf("Int [%s] -> String\n\n", Integer.MIN_VALUE);

    TestInt testInt = new TestInt()
      .setOriginalInt(Integer.MIN_VALUE)
      .persist();

    assertEquals(String.valueOf(Integer.MIN_VALUE), testInt.getCalculatedStringFromInt());
  }

  @Test
  public void maxToString() throws IOException {
    System.out.printf("Int [%s] -> String\n\n", Integer.MAX_VALUE);

    TestInt testInt = new TestInt()
      .setOriginalInt(Integer.MAX_VALUE)
      .persist();

    assertEquals(String.valueOf(Integer.MAX_VALUE), testInt.getCalculatedStringFromInt());
  }

  @Test
  public void randomToString() throws IOException {
    int random = (new Random()).nextInt();
    System.out.printf("Int [%s] -> String\n\n", random);

    TestInt testInt = new TestInt()
      .setOriginalInt(random)
      .persist();

    assertEquals(String.valueOf(random), testInt.getCalculatedStringFromInt());
  }

  @Test
  public void zeroToString() throws IOException {
    System.out.printf("Int [0] -> String\n\n");

    TestInt testInt = new TestInt()
      .setOriginalInt(0)
      .persist();

    assertEquals("0", testInt.getCalculatedStringFromInt());
  }

  @Test
  public void minToLong() throws IOException {
    System.out.printf("Int [%s] -> Long\n\n", Integer.MIN_VALUE);

    TestInt testInt = new TestInt()
      .setOriginalInt(Integer.MIN_VALUE)
      .persist();

    assertEquals((long) Integer.MIN_VALUE, testInt.getCalculatedLongFromInt());
  }

  @Test
  public void maxToLong() throws IOException {
    System.out.printf("Int [%s] -> Long\n\n", Integer.MAX_VALUE);

    TestInt testInt = new TestInt()
      .setOriginalInt(Integer.MAX_VALUE)
      .persist();

    assertEquals((long) Integer.MAX_VALUE, testInt.getCalculatedLongFromInt());
  }

  @Test
  public void randomToLong() throws IOException {
    int random = (new Random()).nextInt();
    System.out.printf("Int [%s] -> Long\n\n", random);

    TestInt testInt = new TestInt()
      .setOriginalInt(random)
      .persist();

    assertEquals((long) random, testInt.getCalculatedLongFromInt());
  }

  @Test
  public void zeroToLong() throws IOException {
    System.out.printf("Int [0] -> String\n\n");

    TestInt testInt = new TestInt()
      .setOriginalInt(0)
      .persist();

    assertEquals(0l, testInt.getCalculatedLongFromInt());
  }

  @Test
  public void randomToDecimal() throws IOException {
    int random = (new Random()).nextInt();
    System.out.printf("Int [%s] -> Decimal\n\n", random);

    TestInt testInt = new TestInt()
      .setOriginalInt(random)
      .persist();

    assertEquals((long) random, testInt.getCalculatedLongFromInt());
  }

  @Test
  public void minToDouble() throws IOException {
    System.out.printf("Int [%s] -> Double\n\n", Integer.MIN_VALUE);

    TestInt testInt = new TestInt()
      .setOriginalInt(Integer.MIN_VALUE)
      .persist();

    assertTrue((double) Integer.MIN_VALUE == testInt.getCalculatedDoubleFromInt());
  }

  @Test
  public void maxToDouble() throws IOException {
    System.out.printf("Int [%s] -> Double\n\n", Integer.MAX_VALUE);

    TestInt testInt = new TestInt()
      .setOriginalInt(Integer.MAX_VALUE)
      .persist();

    assertTrue((double) Integer.MAX_VALUE == testInt.getCalculatedDoubleFromInt());
  }

  @Test
  public void randomToDouble() throws IOException {
    int random = (new Random()).nextInt();
    System.out.printf("Int [%s] -> Double\n\n", random);

    TestInt testInt = new TestInt()
      .setOriginalInt(random)
      .persist();

    assertTrue((double) random == testInt.getCalculatedDoubleFromInt());
  }

  @Test
  public void zeroToDouble() throws IOException {
    System.out.printf("Int [0] -> Double\n\n");

    TestInt testInt = new TestInt()
      .setOriginalInt(0)
      .persist();

    assertTrue(0d == testInt.getCalculatedDoubleFromInt());
  }

  @Test
  public void minToFloat() throws IOException {
    System.out.printf("Int [%s] -> Float\n\n", Integer.MIN_VALUE);

    TestInt testInt = new TestInt()
      .setOriginalInt(Integer.MIN_VALUE)
      .persist();

    assertTrue((float) Integer.MIN_VALUE == testInt.getCalculatedFloatFromInt());
  }

  @Test
  public void maxToFloat() throws IOException {
    System.out.printf("Int [%s] -> Float\n\n", Integer.MAX_VALUE);

    TestInt testInt = new TestInt()
      .setOriginalInt(Integer.MAX_VALUE)
      .persist();

    assertTrue((float) Integer.MAX_VALUE == testInt.getCalculatedFloatFromInt());
  }

  @Test
  public void randomToFloat() throws IOException {
    int random = (new Random()).nextInt();
    System.out.printf("Int [%s] -> Float\n\n", random);

    TestInt testInt = new TestInt()
      .setOriginalInt(random)
      .persist();

    assertTrue((float) random == testInt.getCalculatedFloatFromInt());
  }

  @Test
  public void zeroToFloat() throws IOException {
    System.out.printf("Int [0] -> Float\n\n");

    TestInt testInt = new TestInt()
      .setOriginalInt(0)
      .persist();

    assertTrue(0d == testInt.getCalculatedFloatFromInt());
  }

  @Test
  public void zeroToBoolean() throws IOException {
    System.out.printf("Int [0] -> Float\n\n");

    TestInt testInt = new TestInt()
      .setOriginalInt(0)
      .persist();

    assertTrue(false == testInt.getCalculatedBooleanFromInt());
  }

}
