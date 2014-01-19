package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.TextTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableTexts_6;

public class TestOneArrayOfNullableTexts_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableTexts_6.class.getDeclaredField(
                        "oneArrayOfNullableTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                OneArrayOfNullableTexts_6.class.getDeclaredField(
                        "oneArrayOfNullableTexts").getType());
    }
}
