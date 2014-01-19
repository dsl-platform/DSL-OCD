package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.StringTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableString_5;

public class TestNullableString_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableString_5.class.getDeclaredField(
                        "nullableString").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String.class,
                NullableString_5.class.getDeclaredField(
                        "nullableString").getType());
    }
}
