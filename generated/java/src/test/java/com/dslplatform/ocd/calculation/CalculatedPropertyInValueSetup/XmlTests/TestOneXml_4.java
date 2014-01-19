package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.XmlTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneXml_4;

public class TestOneXml_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneXml_4.class.getDeclaredField(
                        "oneXml").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.w3c.dom.Element.class,
                OneXml_4.class.getDeclaredField(
                        "oneXml").getType());
    }
}
