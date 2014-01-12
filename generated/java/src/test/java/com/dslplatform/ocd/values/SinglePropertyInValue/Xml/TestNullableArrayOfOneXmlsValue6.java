package com.dslplatform.ocd.values.SinglePropertyInValue.Xml;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneXmlsValue6;
import org.scalatest._;

public class TestNullableArrayOfOneXmlsValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneXmlsValue6.class.getDeclaredField(
                        "nullableArrayOfOneXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.w3c.dom.Element[].class,
                NullableArrayOfOneXmlsValue6.class.getDeclaredField(
                        "nullableArrayOfOneXmls").getType());
    }
}
