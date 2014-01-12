package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneDecimalWithScaleOf9Value3;
import org.scalatest._;

public class TestOneDecimalWithScaleOf9Value3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneDecimalWithScaleOf9Value3.class.getDeclaredField(
                        "oneDecimalWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal.class,
                OneDecimalWithScaleOf9Value3.class.getDeclaredField(
                        "oneDecimalWithScaleOf9").getType());
    }
}
