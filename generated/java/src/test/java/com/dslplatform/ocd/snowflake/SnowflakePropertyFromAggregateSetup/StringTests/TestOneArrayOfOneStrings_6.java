package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.StringTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneStrings_6;

public class TestOneArrayOfOneStrings_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneStrings_6.class.getDeclaredField(
                        "oneArrayOfOneStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                OneArrayOfOneStrings_6.class.getDeclaredField(
                        "oneArrayOfOneStrings").getType());
    }
}
