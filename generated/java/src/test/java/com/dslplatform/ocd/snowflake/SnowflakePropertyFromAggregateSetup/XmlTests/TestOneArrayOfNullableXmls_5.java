package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.XmlTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneArrayOfNullableXmls_5;

public class TestOneArrayOfNullableXmls_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableXmls_5.class.getDeclaredField(
                        "oneArrayOfNullableXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.w3c.dom.Element[].class,
                OneArrayOfNullableXmls_5.class.getDeclaredField(
                        "oneArrayOfNullableXmls").getType());
    }
}
