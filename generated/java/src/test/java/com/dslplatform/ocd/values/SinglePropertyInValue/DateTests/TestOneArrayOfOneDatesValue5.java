package com.dslplatform.ocd.values.SinglePropertyInValue.DateTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneDatesValue5;

public class TestOneArrayOfOneDatesValue5 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneDatesValue5.class.getDeclaredField(
                        "oneArrayOfOneDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.LocalDate[].class,
                OneArrayOfOneDatesValue5.class.getDeclaredField(
                        "oneArrayOfOneDates").getType());
    }
}
