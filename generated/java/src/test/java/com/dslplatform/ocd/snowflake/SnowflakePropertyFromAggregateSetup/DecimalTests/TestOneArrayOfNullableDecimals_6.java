package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.DecimalTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableDecimals_6;

public class TestOneArrayOfNullableDecimals_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableDecimals_6.class.getDeclaredField(
                        "oneArrayOfNullableDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                OneArrayOfNullableDecimals_6.class.getDeclaredField(
                        "oneArrayOfNullableDecimals").getType());
    }
}
