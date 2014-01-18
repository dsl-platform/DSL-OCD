package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.DecimalWithScaleOf9Tests;

import com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfOneDecimalsWithScaleOf9_2;

public class TestNullableListOfOneDecimalsWithScaleOf9_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneDecimalsWithScaleOf9_2.class.getDeclaredField(
                        "nullableListOfOneDecimalsWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneDecimalsWithScaleOf9_2.class.getDeclaredField(
                        "nullableListOfOneDecimalsWithScaleOf9").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.math.BigDecimal> nullableListOfOneDecimalsWithScaleOf9 = null;
                }.getClass().getDeclaredField("nullableListOfOneDecimalsWithScaleOf9").getGenericType(),
                NullableListOfOneDecimalsWithScaleOf9_2.class.getDeclaredField("nullableListOfOneDecimalsWithScaleOf9").getGenericType());
    }
}
