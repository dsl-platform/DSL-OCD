package com.dslplatform.ocd.values.SinglePropertyInValue.XmlTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneXmlValue3;

public class TestOneXmlValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneXmlValue3.class.getDeclaredField(
                        "oneXml").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.w3c.dom.Element.class,
                OneXmlValue3.class.getDeclaredField(
                        "oneXml").getType());
    }
}
