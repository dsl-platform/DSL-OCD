package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.BooleanTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableBooleans_2;

public class TestOneSetOfNullableBooleans_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableBooleans_2.class.getDeclaredField(
                        "oneSetOfNullableBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableBooleans_2.class.getDeclaredField(
                        "oneSetOfNullableBooleans").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Boolean> oneSetOfNullableBooleans = null;
                }.getClass().getDeclaredField("oneSetOfNullableBooleans").getGenericType(),
                OneSetOfNullableBooleans_2.class.getDeclaredField("oneSetOfNullableBooleans").getGenericType());
    }
}
