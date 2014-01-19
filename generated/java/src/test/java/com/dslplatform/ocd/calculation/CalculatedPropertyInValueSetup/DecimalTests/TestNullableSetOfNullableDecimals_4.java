package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.DecimalTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableSetOfNullableDecimals_4;

public class TestNullableSetOfNullableDecimals_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableDecimals_4.class.getDeclaredField(
                        "nullableSetOfNullableDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableDecimals_4.class.getDeclaredField(
                        "nullableSetOfNullableDecimals").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.math.BigDecimal> nullableSetOfNullableDecimals = null;
                }.getClass().getDeclaredField("nullableSetOfNullableDecimals").getGenericType(),
                NullableSetOfNullableDecimals_4.class.getDeclaredField("nullableSetOfNullableDecimals").getGenericType());
    }
}
