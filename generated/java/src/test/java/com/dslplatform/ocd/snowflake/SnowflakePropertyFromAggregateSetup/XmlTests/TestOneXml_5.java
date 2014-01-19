package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.XmlTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneXml_5;

public class TestOneXml_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneXml_5.class.getDeclaredField(
                        "oneXml").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.w3c.dom.Element.class,
                OneXml_5.class.getDeclaredField(
                        "oneXml").getType());
    }
}
