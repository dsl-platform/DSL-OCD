package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.FloatTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableFloats_4;

public class TestOneArrayOfNullableFloats_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableFloats_4.class.getDeclaredField(
                        "oneArrayOfNullableFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Float[].class,
                OneArrayOfNullableFloats_4.class.getDeclaredField(
                        "oneArrayOfNullableFloats").getType());
    }
}
