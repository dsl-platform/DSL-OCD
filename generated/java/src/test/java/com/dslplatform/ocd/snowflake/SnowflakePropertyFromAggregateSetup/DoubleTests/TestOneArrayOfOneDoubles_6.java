package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.DoubleTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneDoubles_6;

public class TestOneArrayOfOneDoubles_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneDoubles_6.class.getDeclaredField(
                        "oneArrayOfOneDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                double[].class,
                OneArrayOfOneDoubles_6.class.getDeclaredField(
                        "oneArrayOfOneDoubles").getType());
    }
}
