package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.DecimalTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableDecimals_2;

public class TestOneArrayOfNullableDecimals_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableDecimals_2.class.getDeclaredField(
                        "oneArrayOfNullableDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                OneArrayOfNullableDecimals_2.class.getDeclaredField(
                        "oneArrayOfNullableDecimals").getType());
    }
}
