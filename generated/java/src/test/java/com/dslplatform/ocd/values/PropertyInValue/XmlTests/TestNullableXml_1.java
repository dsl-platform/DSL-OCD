package com.dslplatform.ocd.values.PropertyInValue.XmlTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableXml_1;

public class TestNullableXml_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableXml_1.class.getDeclaredField(
                        "nullableXml").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.w3c.dom.Element.class,
                NullableXml_1.class.getDeclaredField(
                        "nullableXml").getType());
    }
}
