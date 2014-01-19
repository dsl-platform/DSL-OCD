package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.DecimalTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableDecimals_5;

public class TestNullableArrayOfNullableDecimals_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableDecimals_5.class.getDeclaredField(
                        "nullableArrayOfNullableDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                NullableArrayOfNullableDecimals_5.class.getDeclaredField(
                        "nullableArrayOfNullableDecimals").getType());
    }
}
