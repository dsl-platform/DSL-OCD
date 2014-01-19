package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.BinaryTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfOneBinaries_6;

public class TestOneArrayOfOneBinaries_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneBinaries_6.class.getDeclaredField(
                        "oneArrayOfOneBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                byte[][].class,
                OneArrayOfOneBinaries_6.class.getDeclaredField(
                        "oneArrayOfOneBinaries").getType());
    }
}
