package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.BooleanTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableBoolean_3;

public class TestNullableBoolean_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableBoolean_3.class.getDeclaredField(
                        "nullableBoolean").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Boolean.class,
                NullableBoolean_3.class.getDeclaredField(
                        "nullableBoolean").getType());
    }
}
