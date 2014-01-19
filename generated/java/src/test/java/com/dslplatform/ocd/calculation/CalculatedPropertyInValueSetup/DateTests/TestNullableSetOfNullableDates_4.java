package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.DateTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableSetOfNullableDates_4;

public class TestNullableSetOfNullableDates_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableDates_4.class.getDeclaredField(
                        "nullableSetOfNullableDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableDates_4.class.getDeclaredField(
                        "nullableSetOfNullableDates").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<org.joda.time.LocalDate> nullableSetOfNullableDates = null;
                }.getClass().getDeclaredField("nullableSetOfNullableDates").getGenericType(),
                NullableSetOfNullableDates_4.class.getDeclaredField("nullableSetOfNullableDates").getGenericType());
    }
}
