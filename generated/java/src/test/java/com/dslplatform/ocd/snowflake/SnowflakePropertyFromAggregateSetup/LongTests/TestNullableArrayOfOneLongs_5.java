package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.LongTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneLongs_5;

public class TestNullableArrayOfOneLongs_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneLongs_5.class.getDeclaredField(
                        "nullableArrayOfOneLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                long[].class,
                NullableArrayOfOneLongs_5.class.getDeclaredField(
                        "nullableArrayOfOneLongs").getType());
    }
}
