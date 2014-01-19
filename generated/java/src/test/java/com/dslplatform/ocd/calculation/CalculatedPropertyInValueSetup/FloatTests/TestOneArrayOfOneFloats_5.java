package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.FloatTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneArrayOfOneFloats_5;

public class TestOneArrayOfOneFloats_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneFloats_5.class.getDeclaredField(
                        "oneArrayOfOneFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                float[].class,
                OneArrayOfOneFloats_5.class.getDeclaredField(
                        "oneArrayOfOneFloats").getType());
    }
}
