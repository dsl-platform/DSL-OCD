package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.BooleanTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneSetOfOneBooleans_5;

public class TestOneSetOfOneBooleans_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneBooleans_5.class.getDeclaredField(
                        "oneSetOfOneBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneBooleans_5.class.getDeclaredField(
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
                OneSetOfOneBooleans_5.class.getDeclaredField("oneSetOfOneBooleans").getGenericType());
    }
}
