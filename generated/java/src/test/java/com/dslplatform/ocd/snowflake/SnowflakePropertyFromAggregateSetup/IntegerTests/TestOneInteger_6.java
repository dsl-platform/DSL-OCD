package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.IntegerTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneInteger_6;

public class TestOneInteger_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneInteger_6.class.getDeclaredField(
                        "oneInteger").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                int.class,
                OneInteger_6.class.getDeclaredField(
                        "oneInteger").getType());
    }
}
