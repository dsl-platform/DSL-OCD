package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.DecimalWithScaleOf9Tests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableListOfNullableDecimalsWithScaleOf9_4;

public class TestNullableListOfNullableDecimalsWithScaleOf9_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableDecimalsWithScaleOf9_4.class.getDeclaredField(
                        "nullableListOfNullableDecimalsWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableDecimalsWithScaleOf9_4.class.getDeclaredField(
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
                NullableListOfNullableDecimalsWithScaleOf9_4.class.getDeclaredField("nullableListOfNullableDecimalsWithScaleOf9").getGenericType());
    }
}
