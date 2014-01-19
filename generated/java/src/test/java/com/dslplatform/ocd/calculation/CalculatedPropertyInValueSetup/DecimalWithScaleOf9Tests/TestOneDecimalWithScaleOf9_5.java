package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.DecimalWithScaleOf9Tests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneDecimalWithScaleOf9_5;

public class TestOneDecimalWithScaleOf9_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneDecimalWithScaleOf9_5.class.getDeclaredField(
                        "oneDecimalWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal.class,
                OneDecimalWithScaleOf9_5.class.getDeclaredField(
                        "oneDecimalWithScaleOf9").getType());
    }
}
