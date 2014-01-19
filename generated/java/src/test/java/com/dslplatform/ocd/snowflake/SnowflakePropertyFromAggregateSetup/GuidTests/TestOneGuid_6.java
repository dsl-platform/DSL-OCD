package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.GuidTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneGuid_6;

public class TestOneGuid_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneGuid_6.class.getDeclaredField(
                        "oneGuid").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.UUID.class,
                OneGuid_6.class.getDeclaredField(
                        "oneGuid").getType());
    }
}
