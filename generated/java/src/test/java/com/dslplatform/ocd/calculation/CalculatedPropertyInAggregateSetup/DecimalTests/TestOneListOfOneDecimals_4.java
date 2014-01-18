package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.DecimalTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneDecimals_4;

public class TestOneListOfOneDecimals_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneDecimals_4.class.getDeclaredField(
                        "oneListOfOneDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneDecimals_4.class.getDeclaredField(
                        "oneListOfOneDecimals").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.math.BigDecimal> oneListOfOneDecimals = null;
                }.getClass().getDeclaredField("oneListOfOneDecimals").getGenericType(),
                OneListOfOneDecimals_4.class.getDeclaredField("oneListOfOneDecimals").getGenericType());
    }
}
