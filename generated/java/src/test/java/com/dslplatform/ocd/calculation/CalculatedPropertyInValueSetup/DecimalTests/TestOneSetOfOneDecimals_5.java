package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.DecimalTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneSetOfOneDecimals_5;

public class TestOneSetOfOneDecimals_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneDecimals_5.class.getDeclaredField(
                        "oneSetOfOneDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneDecimals_5.class.getDeclaredField(
                        "oneSetOfOneDecimals").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.math.BigDecimal> oneSetOfOneDecimals = null;
                }.getClass().getDeclaredField("oneSetOfOneDecimals").getGenericType(),
                OneSetOfOneDecimals_5.class.getDeclaredField("oneSetOfOneDecimals").getGenericType());
    }
}
