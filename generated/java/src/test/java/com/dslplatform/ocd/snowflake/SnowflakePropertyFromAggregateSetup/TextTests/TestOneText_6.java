package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.TextTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneText_6;

public class TestOneText_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneText_6.class.getDeclaredField(
                        "oneText").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String.class,
                OneText_6.class.getDeclaredField(
                        "oneText").getType());
    }
}
