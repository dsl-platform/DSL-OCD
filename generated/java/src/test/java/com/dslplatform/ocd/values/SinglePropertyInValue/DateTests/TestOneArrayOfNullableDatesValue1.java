package com.dslplatform.ocd.values.SinglePropertyInValue.DateTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableDatesValue1;

public class TestOneArrayOfNullableDatesValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableDatesValue1.class.getDeclaredField(
                        "oneArrayOfNullableDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.LocalDate[].class,
                OneArrayOfNullableDatesValue1.class.getDeclaredField(
                        "oneArrayOfNullableDates").getType());
    }
}
