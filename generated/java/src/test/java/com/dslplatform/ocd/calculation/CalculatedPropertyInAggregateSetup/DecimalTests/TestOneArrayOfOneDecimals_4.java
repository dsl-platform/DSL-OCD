package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.DecimalTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneDecimals_4;

public class TestOneArrayOfOneDecimals_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneDecimals_4.class.getDeclaredField(
                        "oneArrayOfOneDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                OneArrayOfOneDecimals_4.class.getDeclaredField(
                        "oneArrayOfOneDecimals").getType());
    }
}
