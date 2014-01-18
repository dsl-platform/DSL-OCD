package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.XmlTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneXml_3;

public class TestOneXml_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneXml_3.class.getDeclaredField(
                        "oneXml").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.w3c.dom.Element.class,
                OneXml_3.class.getDeclaredField(
                        "oneXml").getType());
    }
}
