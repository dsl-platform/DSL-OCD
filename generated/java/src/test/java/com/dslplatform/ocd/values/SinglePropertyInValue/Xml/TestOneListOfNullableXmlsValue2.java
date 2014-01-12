package com.dslplatform.ocd.values.SinglePropertyInValue.Xml;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableXmlsValue2;
import org.scalatest._;

public class TestOneListOfNullableXmlsValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableXmlsValue2.class.getDeclaredField(
                        "oneListOfNullableXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableXmlsValue2.class.getDeclaredField(
                        "oneListOfNullableXmls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<org.w3c.dom.Element> oneListOfNullableXmls = null;
                }.getClass().getDeclaredField("oneListOfNullableXmls").getGenericType(),
                OneListOfNullableXmlsValue2.class.getDeclaredField("oneListOfNullableXmls").getGenericType());
    }
}
