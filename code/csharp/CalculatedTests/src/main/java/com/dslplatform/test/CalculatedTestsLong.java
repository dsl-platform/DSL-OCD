package com.dslplatform.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Random;

import model.CalculatedTestsLong.TestLong;

import org.junit.Test;

public class CalculatedTestsLong {
  @Test
  public void minToString() throws IOException {
    System.out.printf("Long [%s] -> String\n\n", Long.MIN_VALUE);

    TestLong testLong = new TestLong()
      .setOriginalLong(Long.MIN_VALUE)
      .persist();

    assertEquals(String.valueOf(Long.MIN_VALUE), testLong.getCalculatedStringFromLong());
  }

  @Test
  public void maxToString() throws IOException {
    System.out.printf("Long [%s] -> String\n\n", Long.MAX_VALUE);

    TestLong testLong = new TestLong()
      .setOriginalLong(Long.MAX_VALUE)
      .persist();

    assertEquals(String.valueOf(Long.MAX_VALUE), testLong.getCalculatedStringFromLong());
  }

  @Test
  public void randomToString() throws IOException {
    long random = (new Random()).nextLong();
    System.out.printf("Long [%s] -> String\n\n", random);

    TestLong testLong = new TestLong()
      .setOriginalLong(random)
      .persist();

    assertEquals(String.valueOf(random), testLong.getCalculatedStringFromLong());
  }

  @Test
  public void zeroToString() throws IOException {
    System.out.printf("Long [0] -> String\n\n");

    TestLong testLong = new TestLong()
      .setOriginalLong(0l)
      .persist();

    assertEquals("0", testLong.getCalculatedStringFromLong());
  }

  @Test
  public void randomToInt() throws IOException {
    long random = (new Random(1000)).nextLong();
    System.out.printf("Long [%s] -> Long\n\n", random);

    TestLong testLong = new TestLong()
      .setOriginalLong(random)
      .persist();

    assertEquals((int) random, testLong.getCalculatedIntFromLong());
  }

  @Test
  public void zeroToInt() throws IOException {
    System.out.printf("Long [0] -> String\n\n");

    TestLong testLong = new TestLong()
      .setOriginalLong(0l)
      .persist();

    assertEquals(0, testLong.getCalculatedIntFromLong());
  }

  @Test
  public void randomToDouble() throws IOException {
    long random = (new Random(1000)).nextLong();
    System.out.printf("Long [%s] -> Double\n\n", random);

    TestLong testLong = new TestLong()
      .setOriginalLong(random)
      .persist();

    assertTrue((double) random == testLong.getCalculatedDoubleFromLong());
  }

  @Test
  public void zeroToDouble() throws IOException {
    System.out.printf("Long [0] -> Double\n\n");

    TestLong testLong = new TestLong()
      .setOriginalLong(0l)
      .persist();

    assertTrue(0d == testLong.getCalculatedDoubleFromLong());
  }

  @Test
  public void randomToFloat() throws IOException {
    long random = (new Random(10000)).nextLong();
    System.out.printf("Long [%s] -> Float\n\n", random);

    TestLong testLong = new TestLong()
      .setOriginalLong(random)
      .persist();

    assertTrue((float) random == testLong.getCalculatedFloatFromLong());
  }

  @Test
  public void zeroToFloat() throws IOException {
    System.out.printf("Long [0] -> Float\n\n");

    TestLong testLong = new TestLong()
      .setOriginalLong(0l)
      .persist();

    assertTrue(0f == testLong.getCalculatedFloatFromLong());
  }

  @Test
  public void zeroToBoolean() throws IOException {
    System.out.printf("Long [0] -> Float\n\n");

    TestLong testLong = new TestLong()
      .setOriginalLong(0l)
      .persist();

    assertTrue(false == testLong.getCalculatedBooleanFromLong());
  }

}
