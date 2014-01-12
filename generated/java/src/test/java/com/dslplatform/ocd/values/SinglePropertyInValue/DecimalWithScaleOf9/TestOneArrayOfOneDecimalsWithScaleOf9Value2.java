package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneDecimalsWithScaleOf9Value2;
import org.scalatest._;

public class TestOneArrayOfOneDecimalsWithScaleOf9Value2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneDecimalsWithScaleOf9Value2.class.getDeclaredField(
                        "oneArrayOfOneDecimalsWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                OneArrayOfOneDecimalsWithScaleOf9Value2.class.getDeclaredField(
                        "oneArrayOfOneDecimalsWithScaleOf9").getType());
    }
}
