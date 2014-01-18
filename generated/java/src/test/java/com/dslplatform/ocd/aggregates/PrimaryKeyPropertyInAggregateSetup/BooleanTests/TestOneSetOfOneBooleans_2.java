package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.BooleanTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneBooleans_2;

public class TestOneSetOfOneBooleans_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneBooleans_2.class.getDeclaredField(
                        "oneSetOfOneBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneBooleans_2.class.getDeclaredField(
                        "oneSetOfOneBooleans").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Boolean> oneSetOfOneBooleans = null;
                }.getClass().getDeclaredField("oneSetOfOneBooleans").getGenericType(),
                OneSetOfOneBooleans_2.class.getDeclaredField("oneSetOfOneBooleans").getGenericType());
    }
}
