package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.DateTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableSetOfOneDates_4;

public class TestNullableSetOfOneDates_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneDates_4.class.getDeclaredField(
                        "nullableSetOfOneDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneDates_4.class.getDeclaredField(
                        "nullableSetOfOneDates").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<org.joda.time.LocalDate> nullableSetOfOneDates = null;
                }.getClass().getDeclaredField("nullableSetOfOneDates").getGenericType(),
                NullableSetOfOneDates_4.class.getDeclaredField("nullableSetOfOneDates").getGenericType());
    }
}
