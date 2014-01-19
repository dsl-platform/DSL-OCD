package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.DecimalTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableListOfOneDecimals_4;

public class TestNullableListOfOneDecimals_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneDecimals_4.class.getDeclaredField(
                        "nullableListOfOneDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneDecimals_4.class.getDeclaredField(
                        "nullableListOfOneDecimals").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.math.BigDecimal> nullableListOfOneDecimals = null;
                }.getClass().getDeclaredField("nullableListOfOneDecimals").getGenericType(),
                NullableListOfOneDecimals_4.class.getDeclaredField("nullableListOfOneDecimals").getGenericType());
    }
}
