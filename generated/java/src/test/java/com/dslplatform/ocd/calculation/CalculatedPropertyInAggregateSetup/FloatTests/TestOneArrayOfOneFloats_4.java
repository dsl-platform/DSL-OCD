package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.FloatTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneFloats_4;

public class TestOneArrayOfOneFloats_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneFloats_4.class.getDeclaredField(
                        "oneArrayOfOneFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                float[].class,
                OneArrayOfOneFloats_4.class.getDeclaredField(
                        "oneArrayOfOneFloats").getType());
    }
}
