package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.DateTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableListOfNullableDates_4;

public class TestNullableListOfNullableDates_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableDates_4.class.getDeclaredField(
                        "nullableListOfNullableDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableDates_4.class.getDeclaredField(
                        "nullableListOfNullableDates").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<org.joda.time.LocalDate> nullableListOfNullableDates = null;
                }.getClass().getDeclaredField("nullableListOfNullableDates").getGenericType(),
                NullableListOfNullableDates_4.class.getDeclaredField("nullableListOfNullableDates").getGenericType());
    }
}
