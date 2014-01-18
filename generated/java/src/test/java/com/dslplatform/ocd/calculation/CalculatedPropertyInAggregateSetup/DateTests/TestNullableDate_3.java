package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.DateTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableDate_3;

public class TestNullableDate_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableDate_3.class.getDeclaredField(
                        "nullableDate").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.LocalDate.class,
                NullableDate_3.class.getDeclaredField(
                        "nullableDate").getType());
    }
}
