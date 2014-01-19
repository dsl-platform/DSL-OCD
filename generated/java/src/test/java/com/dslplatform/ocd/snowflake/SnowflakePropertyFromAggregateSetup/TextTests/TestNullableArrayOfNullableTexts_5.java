package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.TextTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableTexts_5;

public class TestNullableArrayOfNullableTexts_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableTexts_5.class.getDeclaredField(
                        "nullableArrayOfNullableTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                NullableArrayOfNullableTexts_5.class.getDeclaredField(
                        "nullableArrayOfNullableTexts").getType());
    }
}
