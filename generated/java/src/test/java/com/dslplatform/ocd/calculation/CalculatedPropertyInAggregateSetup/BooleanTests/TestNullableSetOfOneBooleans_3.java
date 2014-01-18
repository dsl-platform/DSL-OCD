package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.BooleanTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneBooleans_3;

public class TestNullableSetOfOneBooleans_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneBooleans_3.class.getDeclaredField(
                        "nullableSetOfOneBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneBooleans_3.class.getDeclaredField(
                        "nullableSetOfOneBooleans").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Boolean> nullableSetOfOneBooleans = null;
                }.getClass().getDeclaredField("nullableSetOfOneBooleans").getGenericType(),
                NullableSetOfOneBooleans_3.class.getDeclaredField("nullableSetOfOneBooleans").getGenericType());
    }
}
