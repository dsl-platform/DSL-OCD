package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.FloatTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneFloat_4;

public class TestOneFloat_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneFloat_4.class.getDeclaredField(
                        "oneFloat").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                float.class,
                OneFloat_4.class.getDeclaredField(
                        "oneFloat").getType());
    }
}
