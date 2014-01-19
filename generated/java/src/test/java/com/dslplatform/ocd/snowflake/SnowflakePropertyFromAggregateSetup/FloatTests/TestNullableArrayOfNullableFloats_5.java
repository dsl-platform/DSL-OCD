package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.FloatTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableFloats_5;

public class TestNullableArrayOfNullableFloats_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableFloats_5.class.getDeclaredField(
                        "nullableArrayOfNullableFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Float[].class,
                NullableArrayOfNullableFloats_5.class.getDeclaredField(
                        "nullableArrayOfNullableFloats").getType());
    }
}
