package com.dslplatform.ocd.values.SinglePropertyInValue.XmlTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneXmlsValue3;

public class TestOneListOfOneXmlsValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneXmlsValue3.class.getDeclaredField(
                        "oneListOfOneXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneXmlsValue3.class.getDeclaredField(
                        "oneListOfOneXmls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<org.w3c.dom.Element> oneListOfOneXmls = null;
                }.getClass().getDeclaredField("oneListOfOneXmls").getGenericType(),
                OneListOfOneXmlsValue3.class.getDeclaredField("oneListOfOneXmls").getGenericType());
    }
}
