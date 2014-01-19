package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.LongTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneLong_6;

public class TestOneLong_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneLong_6.class.getDeclaredField(
                        "oneLong").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                long.class,
                OneLong_6.class.getDeclaredField(
                        "oneLong").getType());
    }
}
