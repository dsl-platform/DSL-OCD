package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.DecimalTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableDecimals_6;

public class TestOneListOfNullableDecimals_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableDecimals_6.class.getDeclaredField(
                        "oneListOfNullableDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableDecimals_6.class.getDeclaredField(
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
                OneListOfNullableDecimals_6.class.getDeclaredField("oneListOfNullableDecimals").getGenericType());
    }
}
