package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.BooleanTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneListOfNullableBooleans_5;

public class TestOneListOfNullableBooleans_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableBooleans_5.class.getDeclaredField(
                        "oneListOfNullableBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableBooleans_5.class.getDeclaredField(
                        "oneListOfNullableBooleans").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Boolean> oneListOfNullableBooleans = null;
                }.getClass().getDeclaredField("oneListOfNullableBooleans").getGenericType(),
                OneListOfNullableBooleans_5.class.getDeclaredField("oneListOfNullableBooleans").getGenericType());
    }
}
