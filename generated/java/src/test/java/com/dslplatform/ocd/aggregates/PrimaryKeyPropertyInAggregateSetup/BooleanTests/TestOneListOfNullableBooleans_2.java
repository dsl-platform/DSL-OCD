package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.BooleanTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableBooleans_2;

public class TestOneListOfNullableBooleans_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableBooleans_2.class.getDeclaredField(
                        "oneListOfNullableBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableBooleans_2.class.getDeclaredField(
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
                OneListOfNullableBooleans_2.class.getDeclaredField("oneListOfNullableBooleans").getGenericType());
    }
}
