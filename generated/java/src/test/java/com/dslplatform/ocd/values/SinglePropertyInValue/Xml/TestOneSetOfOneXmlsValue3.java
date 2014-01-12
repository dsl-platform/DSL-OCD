package com.dslplatform.ocd.values.SinglePropertyInValue.Xml;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneXmlsValue3;
import org.scalatest._;

public class TestOneSetOfOneXmlsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneXmlsValue3.class.getDeclaredField(
                        "oneSetOfOneXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneXmlsValue3.class.getDeclaredField(
                        "oneSetOfOneXmls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<org.w3c.dom.Element> oneSetOfOneXmls = null;
                }.getClass().getDeclaredField("oneSetOfOneXmls").getGenericType(),
                OneSetOfOneXmlsValue3.class.getDeclaredField("oneSetOfOneXmls").getGenericType());
    }
}
