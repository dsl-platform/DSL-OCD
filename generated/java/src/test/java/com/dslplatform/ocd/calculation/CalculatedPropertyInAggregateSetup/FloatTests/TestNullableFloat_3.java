package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.FloatTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableFloat_3;

public class TestNullableFloat_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableFloat_3.class.getDeclaredField(
                        "nullableFloat").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Float.class,
                NullableFloat_3.class.getDeclaredField(
                        "nullableFloat").getType());
    }
}
