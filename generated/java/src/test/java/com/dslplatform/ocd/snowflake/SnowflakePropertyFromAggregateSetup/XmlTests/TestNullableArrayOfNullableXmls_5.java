package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.XmlTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfNullableXmls_5;

public class TestNullableArrayOfNullableXmls_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableXmls_5.class.getDeclaredField(
                        "nullableArrayOfNullableXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.w3c.dom.Element[].class,
                NullableArrayOfNullableXmls_5.class.getDeclaredField(
                        "nullableArrayOfNullableXmls").getType());
    }
}
