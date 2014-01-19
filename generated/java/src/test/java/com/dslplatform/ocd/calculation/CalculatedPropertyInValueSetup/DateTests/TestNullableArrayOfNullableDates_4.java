package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.DateTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableArrayOfNullableDates_4;

public class TestNullableArrayOfNullableDates_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableDates_4.class.getDeclaredField(
                        "nullableArrayOfNullableDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.LocalDate[].class,
                NullableArrayOfNullableDates_4.class.getDeclaredField(
                        "nullableArrayOfNullableDates").getType());
    }
}
