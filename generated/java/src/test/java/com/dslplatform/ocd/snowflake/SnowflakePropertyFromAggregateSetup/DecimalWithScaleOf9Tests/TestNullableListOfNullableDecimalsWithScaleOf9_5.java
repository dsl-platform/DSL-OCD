package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.DecimalWithScaleOf9Tests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableDecimalsWithScaleOf9_5;

public class TestNullableListOfNullableDecimalsWithScaleOf9_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableDecimalsWithScaleOf9_5.class.getDeclaredField(
                        "nullableListOfNullableDecimalsWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableDecimalsWithScaleOf9_5.class.getDeclaredField(
                        "nullableListOfNullableDecimalsWithScaleOf9").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.math.BigDecimal> nullableListOfNullableDecimalsWithScaleOf9 = null;
                }.getClass().getDeclaredField("nullableListOfNullableDecimalsWithScaleOf9").getGenericType(),
                NullableListOfNullableDecimalsWithScaleOf9_5.class.getDeclaredField("nullableListOfNullableDecimalsWithScaleOf9").getGenericType());
    }
}
