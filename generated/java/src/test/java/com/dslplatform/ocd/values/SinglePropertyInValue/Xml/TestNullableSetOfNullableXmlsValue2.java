package com.dslplatform.ocd.values.SinglePropertyInValue.Xml;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableXmlsValue2;
import org.scalatest._;

public class TestNullableSetOfNullableXmlsValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableXmlsValue2.class.getDeclaredField(
                        "nullableSetOfNullableXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableXmlsValue2.class.getDeclaredField(
                        "nullableSetOfNullableXmls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<org.w3c.dom.Element> nullableSetOfNullableXmls = null;
                }.getClass().getDeclaredField("nullableSetOfNullableXmls").getGenericType(),
                NullableSetOfNullableXmlsValue2.class.getDeclaredField("nullableSetOfNullableXmls").getGenericType());
    }
}
