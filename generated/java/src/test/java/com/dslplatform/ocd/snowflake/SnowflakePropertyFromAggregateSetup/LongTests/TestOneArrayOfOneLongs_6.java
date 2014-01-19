package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.LongTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneLongs_6;

public class TestOneArrayOfOneLongs_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneLongs_6.class.getDeclaredField(
                        "oneArrayOfOneLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                long[].class,
                OneArrayOfOneLongs_6.class.getDeclaredField(
                        "oneArrayOfOneLongs").getType());
    }
}
