package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.IntegerTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneIntegers_6;

public class TestOneArrayOfOneIntegers_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneIntegers_6.class.getDeclaredField(
                        "oneArrayOfOneIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                int[].class,
                OneArrayOfOneIntegers_6.class.getDeclaredField(
                        "oneArrayOfOneIntegers").getType());
    }
}
