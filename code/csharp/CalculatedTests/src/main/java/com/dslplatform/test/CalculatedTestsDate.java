package com.dslplatform.test;

import static org.junit.Assert.*;

import java.io.IOException;

import model.CalculatedTestsDate.TestDate;

import org.joda.time.*;
import org.junit.Test;

public class CalculatedTestsDate {

  @Test
  public void localDateToDateTime() throws IOException  {
    System.out.println("LocalDate -> DateTime\n");
    TestDate testDate = new TestDate()
      .setOriginalDate(LocalDate.now())
      .persist();

    assertEquals(DateTime.now(), testDate.getCalculatedTimestampFromDate());
  }

  @Test
  public void dateTimeToLocalDate() throws IOException  {
    System.out.println("DateTime -> LocalDate\n");
    TestDate testDate = new TestDate()
      .setOriginalTimestamp(DateTime.now())
      .persist();

    assertEquals(LocalDate.now(), testDate.getCalculatedDateFromTimestamp());
  }


}
