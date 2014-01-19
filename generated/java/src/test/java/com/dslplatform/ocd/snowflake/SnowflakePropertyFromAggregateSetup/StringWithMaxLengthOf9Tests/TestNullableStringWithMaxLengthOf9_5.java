package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableStringWithMaxLengthOf9_5;

public class TestNullableStringWithMaxLengthOf9_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableStringWithMaxLengthOf9_5.class.getDeclaredField(
                        "nullableStringWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String.class,
                NullableStringWithMaxLengthOf9_5.class.getDeclaredField(
                        "nullableStringWithMaxLengthOf9").getType());
    }
}
