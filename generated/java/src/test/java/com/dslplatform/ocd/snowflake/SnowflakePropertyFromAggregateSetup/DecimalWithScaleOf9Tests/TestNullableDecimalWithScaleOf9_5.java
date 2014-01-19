package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.DecimalWithScaleOf9Tests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableDecimalWithScaleOf9_5;

public class TestNullableDecimalWithScaleOf9_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableDecimalWithScaleOf9_5.class.getDeclaredField(
                        "nullableDecimalWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal.class,
                NullableDecimalWithScaleOf9_5.class.getDeclaredField(
                        "nullableDecimalWithScaleOf9").getType());
    }
}
