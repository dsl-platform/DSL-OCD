package com.dslplatform.test;

import static org.junit.Assert.*;

import java.io.IOException;

import model.CalculatedTestsBoolean.TestBoolean;
import org.junit.Test;

public class CalculatedTestsBoolean{

  @Test
  public void booleanToString() throws IOException  {
    System.out.println("Boolean -> String\n");
    TestBoolean testBoolean = new TestBoolean()
      .setOriginalBoolean(true)
      .persist();

    assertTrue("true".equalsIgnoreCase(testBoolean.getCalculatedStringFromBoolean()));
  }

}
