package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.BooleanTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableBoolean_5;

public class TestNullableBoolean_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableBoolean_5.class.getDeclaredField(
                        "nullableBoolean").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Boolean.class,
                NullableBoolean_5.class.getDeclaredField(
                        "nullableBoolean").getType());
    }
}
