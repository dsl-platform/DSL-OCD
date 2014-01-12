package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableDecimalsWithScaleOf9Value2;

public class TestOneSetOfNullableDecimalsWithScaleOf9Value2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableDecimalsWithScaleOf9Value2.class.getDeclaredField(
                        "oneSetOfNullableDecimalsWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableDecimalsWithScaleOf9Value2.class.getDeclaredField(
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
                OneSetOfNullableDecimalsWithScaleOf9Value2.class.getDeclaredField("oneSetOfNullableDecimalsWithScaleOf9").getGenericType());
    }
}
