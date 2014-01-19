package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.DecimalWithScaleOf9Tests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableDecimalWithScaleOf9_4;

public class TestNullableDecimalWithScaleOf9_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableDecimalWithScaleOf9_4.class.getDeclaredField(
                        "nullableDecimalWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal.class,
                NullableDecimalWithScaleOf9_4.class.getDeclaredField(
                        "nullableDecimalWithScaleOf9").getType());
    }
}
