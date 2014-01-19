package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.BooleanTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableListOfNullableBooleans_4;

public class TestNullableListOfNullableBooleans_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableBooleans_4.class.getDeclaredField(
                        "nullableListOfNullableBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableBooleans_4.class.getDeclaredField(
                        "nullableListOfNullableBooleans").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Boolean> nullableListOfNullableBooleans = null;
                }.getClass().getDeclaredField("nullableListOfNullableBooleans").getGenericType(),
                NullableListOfNullableBooleans_4.class.getDeclaredField("nullableListOfNullableBooleans").getGenericType());
    }
}
