package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.DecimalTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneDecimals_5;

public class TestNullableListOfOneDecimals_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneDecimals_5.class.getDeclaredField(
                        "nullableListOfOneDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneDecimals_5.class.getDeclaredField(
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
                NullableListOfOneDecimals_5.class.getDeclaredField("nullableListOfOneDecimals").getGenericType());
    }
}
