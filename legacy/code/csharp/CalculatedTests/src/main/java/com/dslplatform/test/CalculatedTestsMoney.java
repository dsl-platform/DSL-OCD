package com.dslplatform.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Random;

import model.CalculatedTestsMoney.TestMoney;

import org.junit.Test;

public class CalculatedTestsMoney {

  @Test
  public void maxValueToString() throws IOException {
    BigDecimal value = new BigDecimal(Integer.MAX_VALUE);
    System.out.printf("Money [%s] -> String\n\n", value);

    TestMoney testMoney = new TestMoney()
      .setOriginalMoney(value)
      .persist();

    assertEquals(value.toString(), testMoney.getCalculatedStringFromMoney());
  }

  @Test
  public void minValueToString() throws IOException {
    BigDecimal value = new BigDecimal(Integer.MIN_VALUE);
    System.out.printf("Money [%s] -> String\n\n", value);

    TestMoney testMoney = new TestMoney()
      .setOriginalMoney(value)
      .persist();

    assertEquals(value.toString(), testMoney.getCalculatedStringFromMoney());
  }

  @Test
  public void zeroToString() throws IOException {
    System.out.printf("Money [0] -> String\n\n");

    TestMoney testMoney = new TestMoney()
      .setOriginalMoney(BigDecimal.ZERO)
      .persist();

    assertEquals(BigDecimal.ZERO.toString(), testMoney.getCalculatedStringFromMoney());
  }

  @Test
  public void randomToString() throws IOException {
    BigDecimal random = new BigDecimal((new Random()).nextFloat());
    System.out.printf("Money [%s] -> String\n\n", random);

    TestMoney testMoney = new TestMoney()
      .setOriginalMoney(random)
      .persist();

    assertEquals(random.toString(), testMoney.getCalculatedStringFromMoney());
  }

  @Test
  public void maxValueToInt() throws IOException {
    BigDecimal value = new BigDecimal(Integer.MAX_VALUE);
    System.out.printf("Money [%s] -> Int\n\n", value);
    TestMoney testMoney = new TestMoney()
      .setOriginalMoney(value)
      .persist();
    assertEquals(value.intValue(), testMoney.getCalculatedIntFromMoney());

  }

  @Test
  public void minValueToInt() throws IOException {
    BigDecimal value = new BigDecimal(Integer.MIN_VALUE);
    System.out.printf("Money [%s] -> Int\n\n", value);

    TestMoney testMoney = new TestMoney()
      .setOriginalMoney(value)
      .persist();

    assertEquals(value.intValue(), testMoney.getCalculatedIntFromMoney());
  }

  @Test
  public void zeroToInt() throws IOException {
    System.out.printf("Money [0] -> Int\n\n");

    TestMoney testMoney = new TestMoney()
      .setOriginalMoney(BigDecimal.ZERO)
      .persist();

    assertEquals(0, testMoney.getCalculatedIntFromMoney());
  }

  @Test
  public void randomToInt() throws IOException {
    BigDecimal random = new BigDecimal((new Random()).nextFloat());
    System.out.printf("Money [%s] -> Int\n\n", random);

    TestMoney testMoney = new TestMoney()
      .setOriginalMoney(random)
      .persist();

    assertEquals(random.intValue(), testMoney.getCalculatedIntFromMoney());
  }

  @Test
  public void maxValueToDouble() throws IOException {
    BigDecimal value = new BigDecimal(Integer.MAX_VALUE);
    System.out.printf("Money [%s] -> Double\n\n", value);
    TestMoney testMoney = new TestMoney()
      .setOriginalMoney(value)
      .persist();
    assertTrue(value.doubleValue() == testMoney.getCalculatedDoubleFromMoney());
  }

  @Test
  public void minValueToDouble() throws IOException {
    BigDecimal value = new BigDecimal(Integer.MAX_VALUE);
    System.out.printf("Money [%s] -> Double\n\n", value);

    TestMoney testMoney = new TestMoney()
      .setOriginalMoney(value)
      .persist();

    assertTrue(value.doubleValue() == testMoney.getCalculatedDoubleFromMoney());
  }

  @Test
  public void zeroToDouble() throws IOException {
    System.out.printf("Money [0] -> Double\n\n");

    TestMoney testMoney = new TestMoney()
      .setOriginalMoney(BigDecimal.ZERO)
      .persist();

    assertTrue(BigDecimal.ZERO.doubleValue() == testMoney.getCalculatedDoubleFromMoney());
  }

  @Test
  public void randomToDouble() throws IOException {
    BigDecimal random = new BigDecimal((new Random()).nextFloat());
    System.out.printf("Money [%s] -> Double\n\n", random);

    TestMoney testMoney = new TestMoney()
      .setOriginalMoney(random)
      .persist();

    assertTrue(random.doubleValue() == testMoney.getCalculatedDoubleFromMoney());
  }


  @Test
  public void zeroToLong() throws IOException {
    System.out.printf("Money [0] -> Long\n\n");

    TestMoney testMoney = new TestMoney()
      .setOriginalMoney(BigDecimal.ZERO)
      .persist();

    assertEquals(0l, testMoney.getCalculatedLongFromMoney());
  }

  @Test
  public void randomToLong() throws IOException {
    BigDecimal random = new BigDecimal((new Random()).nextFloat());
    System.out.printf("Money [%s] -> Long\n\n", random);

    TestMoney testMoney = new TestMoney()
      .setOriginalMoney(random)
      .persist();

    assertEquals(random.longValue(), testMoney.getCalculatedLongFromMoney());
  }

  @Test
  public void randomToFloat() throws IOException {
    BigDecimal random = new BigDecimal((new Random()).nextFloat());
    System.out.printf("Money [%s] -> Decimal\n\n", random);

    TestMoney testMoney = new TestMoney()
      .setOriginalMoney(random)
      .persist();

    assertEquals(random, testMoney.getCalculatedDecimalFromMoney());
  }

  @Test
  public void zeroToFloat() throws IOException {
    System.out.printf("Money [0] -> Boolean\n\n");

    TestMoney testMoney = new TestMoney()
      .setOriginalMoney(BigDecimal.ZERO)
      .persist();

    assertEquals(0f, testMoney.getCalculatedFloatFromMoney(), 6);
  }

  @Test
  public void zeroToBoolean() throws IOException {
    System.out.printf("Money [0] -> Boolean\n\n");

    TestMoney testMoney = new TestMoney()
      .setOriginalMoney(BigDecimal.ZERO)
      .persist();

    assertEquals(false, testMoney.getCalculatedBooleanFromMoney());
  }

}
