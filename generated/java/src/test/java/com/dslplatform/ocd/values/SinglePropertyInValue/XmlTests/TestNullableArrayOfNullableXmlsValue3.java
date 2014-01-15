package com.dslplatform.ocd.values.SinglePropertyInValue.XmlTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableXmlsValue3;

public class TestNullableArrayOfNullableXmlsValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableXmlsValue3.class.getDeclaredField(
                        "nullableArrayOfNullableXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.w3c.dom.Element[].class,
                NullableArrayOfNullableXmlsValue3.class.getDeclaredField(
                        "nullableArrayOfNullableXmls").getType());
    }
}
