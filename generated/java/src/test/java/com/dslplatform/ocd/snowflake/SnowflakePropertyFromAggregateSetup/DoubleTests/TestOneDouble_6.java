package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.DoubleTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneDouble_6;

public class TestOneDouble_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneDouble_6.class.getDeclaredField(
                        "oneDouble").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                double.class,
                OneDouble_6.class.getDeclaredField(
                        "oneDouble").getType());
    }
}
