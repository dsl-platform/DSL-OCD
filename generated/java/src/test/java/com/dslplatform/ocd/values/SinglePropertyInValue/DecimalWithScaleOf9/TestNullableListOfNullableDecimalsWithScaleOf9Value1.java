package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableDecimalsWithScaleOf9Value1;

public class TestNullableListOfNullableDecimalsWithScaleOf9Value1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableDecimalsWithScaleOf9Value1.class.getDeclaredField(
                        "nullableListOfNullableDecimalsWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableDecimalsWithScaleOf9Value1.class.getDeclaredField(
                        "nullableListOfNullableDecimalsWithScaleOf9").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.math.BigDecimal> nullableListOfNullableDecimalsWithScaleOf9 = null;
                }.getClass().getDeclaredField("nullableListOfNullableDecimalsWithScaleOf9").getGenericType(),
                NullableListOfNullableDecimalsWithScaleOf9Value1.class.getDeclaredField("nullableListOfNullableDecimalsWithScaleOf9").getGenericType());
    }
}
