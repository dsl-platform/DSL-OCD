package com.dslplatform.ocd.values.SinglePropertyInValue.DateTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableDateValue3;

public class TestNullableDateValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableDateValue3.class.getDeclaredField(
                        "nullableDate").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.LocalDate.class,
                NullableDateValue3.class.getDeclaredField(
                        "nullableDate").getType());
    }
}
