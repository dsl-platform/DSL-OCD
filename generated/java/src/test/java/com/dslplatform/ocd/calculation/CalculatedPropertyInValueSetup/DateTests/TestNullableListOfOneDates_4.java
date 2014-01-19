package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.DateTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableListOfOneDates_4;

public class TestNullableListOfOneDates_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneDates_4.class.getDeclaredField(
                        "nullableListOfOneDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneDates_4.class.getDeclaredField(
                        "nullableListOfOneDates").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<org.joda.time.LocalDate> nullableListOfOneDates = null;
                }.getClass().getDeclaredField("nullableListOfOneDates").getGenericType(),
                NullableListOfOneDates_4.class.getDeclaredField("nullableListOfOneDates").getGenericType());
    }
}
