package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9Tests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableDecimalWithScaleOf9Value3;

public class TestNullableDecimalWithScaleOf9Value3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableDecimalWithScaleOf9Value3.class.getDeclaredField(
                        "nullableDecimalWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal.class,
                NullableDecimalWithScaleOf9Value3.class.getDeclaredField(
                        "nullableDecimalWithScaleOf9").getType());
    }
}
