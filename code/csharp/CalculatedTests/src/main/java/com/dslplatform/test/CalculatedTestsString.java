package com.dslplatform.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Random;

import model.CalculatedTestsString.TestString;

import org.junit.Test;

public class CalculatedTestsString {

  @Test
  public void randomToInt() throws IOException {
    String random = String.valueOf((new Random()).nextInt());
    System.out.printf("String [%s] -> Int\n\n", random);
    TestString testStr = new TestString()
      .setOriginalString(random)
      .persist();

    assertTrue(Integer.parseInt(random) == testStr.getCalculatedIntFromString());
  }

  @Test
  public void randomToLong() throws IOException {
    String random = String.valueOf((new Random()).nextLong());
    System.out.printf("String [%s] -> Long\n\n", random);
    TestString testStr = new TestString()
      .setOriginalString(random)
      .persist();

    assertTrue(Long.parseLong(random) == testStr.getCalculatedLongFromString());
  }

  @Test
  public void randomToDouble() throws IOException {
    String random = String.valueOf((new Random()).nextDouble());
    System.out.printf("String [%s] -> Double\n\n", random);
    TestString testStr = new TestString()
      .setOriginalString(random)
      .persist();

    assertTrue(Double.parseDouble(random) == testStr.getCalculatedDoubleFromString());
  }

  @Test
  public void randomToFloat() throws IOException {
    String random = String.valueOf((new Random()).nextFloat());
    System.out.printf("String [%s] -> Float\n\n", random);
    TestString testStr = new TestString()
      .setOriginalString(random)
      .persist();

    assertTrue(Float.parseFloat(random) == testStr.getCalculatedFloatFromString());
  }

  @Test
  public void randomToDecimal() throws IOException {
    String random = new BigDecimal((new Random()).nextFloat()).toString();
    System.out.printf("String [%s] -> Decimal\n\n", random);
    TestString testStr = new TestString()
      .setOriginalString(random)
      .persist();

    assertEquals(new BigDecimal(random), testStr.getCalculatedDecimalFromString());
  }

  @Test
  public void randomToBinary() throws IOException {
    fail("String to Binary not implemented!");
  }

  @Test
  public void strToBoolean() throws IOException {
    System.out.printf("String [true] -> Boolean\n\n");

    TestString testStr = new TestString()
      .setOriginalString("true")
      .persist();

    assertEquals(true, testStr.getCalculatedBooleanFromString());
  }

  @Test
  public void strToGuid() throws IOException {
    fail("String to GUID not implemented!");
  }

  @Test
  public void strToXml() throws IOException {
    fail("String to Xml not implemented!");
  }

  @Test
  public void strToMap() throws IOException {
    fail("String to Map not implemented!");
  }

}
