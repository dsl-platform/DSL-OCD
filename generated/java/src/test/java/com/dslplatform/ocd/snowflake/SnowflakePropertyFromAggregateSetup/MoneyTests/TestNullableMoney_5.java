package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.MoneyTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableMoney_5;

public class TestNullableMoney_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableMoney_5.class.getDeclaredField(
                        "nullableMoney").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal.class,
                NullableMoney_5.class.getDeclaredField(
                        "nullableMoney").getType());
    }
}
