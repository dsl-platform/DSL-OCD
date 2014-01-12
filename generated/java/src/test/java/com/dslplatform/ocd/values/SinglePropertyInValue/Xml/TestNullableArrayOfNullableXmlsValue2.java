package com.dslplatform.ocd.values.SinglePropertyInValue.Xml;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableXmlsValue2;
import org.scalatest._;

public class TestNullableArrayOfNullableXmlsValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableXmlsValue2.class.getDeclaredField(
                        "nullableArrayOfNullableXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.w3c.dom.Element[].class,
                NullableArrayOfNullableXmlsValue2.class.getDeclaredField(
                        "nullableArrayOfNullableXmls").getType());
    }
}
