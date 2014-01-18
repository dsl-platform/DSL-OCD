package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.DoubleTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneDoubles_4;

public class TestOneArrayOfOneDoubles_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneDoubles_4.class.getDeclaredField(
                        "oneArrayOfOneDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                double[].class,
                OneArrayOfOneDoubles_4.class.getDeclaredField(
                        "oneArrayOfOneDoubles").getType());
    }
}
