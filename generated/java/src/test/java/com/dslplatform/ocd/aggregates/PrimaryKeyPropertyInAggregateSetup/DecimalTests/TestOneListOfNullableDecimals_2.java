package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.DecimalTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableDecimals_2;

public class TestOneListOfNullableDecimals_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableDecimals_2.class.getDeclaredField(
                        "oneListOfNullableDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableDecimals_2.class.getDeclaredField(
                        "oneListOfNullableDecimals").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.math.BigDecimal> oneListOfNullableDecimals = null;
                }.getClass().getDeclaredField("oneListOfNullableDecimals").getGenericType(),
                OneListOfNullableDecimals_2.class.getDeclaredField("oneListOfNullableDecimals").getGenericType());
    }
}
