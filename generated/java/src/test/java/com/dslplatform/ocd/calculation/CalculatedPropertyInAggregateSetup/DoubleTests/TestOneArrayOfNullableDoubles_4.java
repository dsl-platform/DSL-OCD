package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.DoubleTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableDoubles_4;

public class TestOneArrayOfNullableDoubles_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableDoubles_4.class.getDeclaredField(
                        "oneArrayOfNullableDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Double[].class,
                OneArrayOfNullableDoubles_4.class.getDeclaredField(
                        "oneArrayOfNullableDoubles").getType());
    }
}
