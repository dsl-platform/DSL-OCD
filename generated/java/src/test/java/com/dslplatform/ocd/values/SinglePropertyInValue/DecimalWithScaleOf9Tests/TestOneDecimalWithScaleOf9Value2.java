package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9Tests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneDecimalWithScaleOf9Value2;

public class TestOneDecimalWithScaleOf9Value2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneDecimalWithScaleOf9Value2.class.getDeclaredField(
                        "oneDecimalWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal.class,
                OneDecimalWithScaleOf9Value2.class.getDeclaredField(
                        "oneDecimalWithScaleOf9").getType());
    }
}
