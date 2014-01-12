package com.dslplatform.ocd.values.SinglePropertyInValue.Xml;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableXmlsValue4;
import org.scalatest._;

public class TestOneArrayOfNullableXmlsValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableXmlsValue4.class.getDeclaredField(
                        "oneArrayOfNullableXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.w3c.dom.Element[].class,
                OneArrayOfNullableXmlsValue4.class.getDeclaredField(
                        "oneArrayOfNullableXmls").getType());
    }
}
