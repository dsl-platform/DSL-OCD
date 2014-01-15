package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9Tests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableDecimalsWithScaleOf9Value2;

public class TestNullableSetOfNullableDecimalsWithScaleOf9Value2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableDecimalsWithScaleOf9Value2.class.getDeclaredField(
                        "nullableSetOfNullableDecimalsWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableDecimalsWithScaleOf9Value2.class.getDeclaredField(
                        "nullableSetOfNullableDecimalsWithScaleOf9").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.math.BigDecimal> nullableSetOfNullableDecimalsWithScaleOf9 = null;
                }.getClass().getDeclaredField("nullableSetOfNullableDecimalsWithScaleOf9").getGenericType(),
                NullableSetOfNullableDecimalsWithScaleOf9Value2.class.getDeclaredField("nullableSetOfNullableDecimalsWithScaleOf9").getGenericType());
    }
}
