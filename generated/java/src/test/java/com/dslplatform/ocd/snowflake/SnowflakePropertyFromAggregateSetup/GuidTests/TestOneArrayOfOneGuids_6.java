package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.GuidTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneGuids_6;

public class TestOneArrayOfOneGuids_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneGuids_6.class.getDeclaredField(
                        "oneArrayOfOneGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.UUID[].class,
                OneArrayOfOneGuids_6.class.getDeclaredField(
                        "oneArrayOfOneGuids").getType());
    }
}
