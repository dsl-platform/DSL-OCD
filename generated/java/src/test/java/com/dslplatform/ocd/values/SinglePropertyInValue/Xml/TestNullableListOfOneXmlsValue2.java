package com.dslplatform.ocd.values.SinglePropertyInValue.Xml;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneXmlsValue2;
import org.scalatest._;

public class TestNullableListOfOneXmlsValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneXmlsValue2.class.getDeclaredField(
                        "nullableListOfOneXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneXmlsValue2.class.getDeclaredField(
                        "nullableListOfOneXmls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<org.w3c.dom.Element> nullableListOfOneXmls = null;
                }.getClass().getDeclaredField("nullableListOfOneXmls").getGenericType(),
                NullableListOfOneXmlsValue2.class.getDeclaredField("nullableListOfOneXmls").getGenericType());
    }
}
