package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.DecimalWithScaleOf9Tests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableArrayOfNullableDecimalsWithScaleOf9_4;

public class TestNullableArrayOfNullableDecimalsWithScaleOf9_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableDecimalsWithScaleOf9_4.class.getDeclaredField(
                        "nullableArrayOfNullableDecimalsWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                NullableArrayOfNullableDecimalsWithScaleOf9_4.class.getDeclaredField(
                        "nullableArrayOfNullableDecimalsWithScaleOf9").getType());
    }
}
