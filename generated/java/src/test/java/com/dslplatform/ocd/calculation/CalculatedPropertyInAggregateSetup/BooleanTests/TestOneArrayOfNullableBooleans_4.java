package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.BooleanTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableBooleans_4;

public class TestOneArrayOfNullableBooleans_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableBooleans_4.class.getDeclaredField(
                        "oneArrayOfNullableBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Boolean[].class,
                OneArrayOfNullableBooleans_4.class.getDeclaredField(
                        "oneArrayOfNullableBooleans").getType());
    }
}
