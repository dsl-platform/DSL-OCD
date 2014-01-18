package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.DecimalWithScaleOf9Tests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneDecimalWithScaleOf9_4;

public class TestOneDecimalWithScaleOf9_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneDecimalWithScaleOf9_4.class.getDeclaredField(
                        "oneDecimalWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal.class,
                OneDecimalWithScaleOf9_4.class.getDeclaredField(
                        "oneDecimalWithScaleOf9").getType());
    }
}
