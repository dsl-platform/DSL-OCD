package com.dslplatform.ocd.values.SinglePropertyInValue.Date;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableDatesValue2;
import org.scalatest._;

public class TestOneArrayOfNullableDatesValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableDatesValue2.class.getDeclaredField(
                        "oneArrayOfNullableDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.LocalDate[].class,
                OneArrayOfNullableDatesValue2.class.getDeclaredField(
                        "oneArrayOfNullableDates").getType());
    }
}
