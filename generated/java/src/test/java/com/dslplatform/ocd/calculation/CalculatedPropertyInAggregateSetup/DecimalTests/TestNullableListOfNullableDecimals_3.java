package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.DecimalTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableDecimals_3;

public class TestNullableListOfNullableDecimals_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableDecimals_3.class.getDeclaredField(
                        "nullableListOfNullableDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableDecimals_3.class.getDeclaredField(
                        "nullableListOfNullableDecimals").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.math.BigDecimal> nullableListOfNullableDecimals = null;
                }.getClass().getDeclaredField("nullableListOfNullableDecimals").getGenericType(),
                NullableListOfNullableDecimals_3.class.getDeclaredField("nullableListOfNullableDecimals").getGenericType());
    }
}
