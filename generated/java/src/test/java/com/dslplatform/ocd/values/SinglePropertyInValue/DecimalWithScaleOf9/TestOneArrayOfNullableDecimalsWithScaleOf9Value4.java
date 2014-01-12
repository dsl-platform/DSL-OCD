package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableDecimalsWithScaleOf9Value4;
import org.scalatest._;

public class TestOneArrayOfNullableDecimalsWithScaleOf9Value4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableDecimalsWithScaleOf9Value4.class.getDeclaredField(
                        "oneArrayOfNullableDecimalsWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                OneArrayOfNullableDecimalsWithScaleOf9Value4.class.getDeclaredField(
                        "oneArrayOfNullableDecimalsWithScaleOf9").getType());
    }
}
