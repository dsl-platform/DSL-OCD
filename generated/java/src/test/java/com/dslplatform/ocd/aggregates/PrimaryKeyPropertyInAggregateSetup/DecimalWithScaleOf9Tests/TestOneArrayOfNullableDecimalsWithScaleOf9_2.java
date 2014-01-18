package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.DecimalWithScaleOf9Tests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableDecimalsWithScaleOf9_2;

public class TestOneArrayOfNullableDecimalsWithScaleOf9_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableDecimalsWithScaleOf9_2.class.getDeclaredField(
                        "oneArrayOfNullableDecimalsWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                OneArrayOfNullableDecimalsWithScaleOf9_2.class.getDeclaredField(
                        "oneArrayOfNullableDecimalsWithScaleOf9").getType());
    }
}
