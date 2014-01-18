package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.DecimalWithScaleOf9Tests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableDecimalsWithScaleOf9_4;

public class TestOneSetOfNullableDecimalsWithScaleOf9_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableDecimalsWithScaleOf9_4.class.getDeclaredField(
                        "oneSetOfNullableDecimalsWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableDecimalsWithScaleOf9_4.class.getDeclaredField(
                        "oneSetOfNullableDecimalsWithScaleOf9").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.math.BigDecimal> oneSetOfNullableDecimalsWithScaleOf9 = null;
                }.getClass().getDeclaredField("oneSetOfNullableDecimalsWithScaleOf9").getGenericType(),
                OneSetOfNullableDecimalsWithScaleOf9_4.class.getDeclaredField("oneSetOfNullableDecimalsWithScaleOf9").getGenericType());
    }
}
