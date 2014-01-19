package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.IntegerTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableInteger_5;

public class TestNullableInteger_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableInteger_5.class.getDeclaredField(
                        "nullableInteger").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Integer.class,
                NullableInteger_5.class.getDeclaredField(
                        "nullableInteger").getType());
    }
}
