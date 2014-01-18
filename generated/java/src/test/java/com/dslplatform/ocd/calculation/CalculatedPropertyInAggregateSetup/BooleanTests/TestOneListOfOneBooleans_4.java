package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.BooleanTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneBooleans_4;

public class TestOneListOfOneBooleans_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneBooleans_4.class.getDeclaredField(
                        "oneListOfOneBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneBooleans_4.class.getDeclaredField(
                        "oneListOfOneBooleans").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Boolean> oneListOfOneBooleans = null;
                }.getClass().getDeclaredField("oneListOfOneBooleans").getGenericType(),
                OneListOfOneBooleans_4.class.getDeclaredField("oneListOfOneBooleans").getGenericType());
    }
}
