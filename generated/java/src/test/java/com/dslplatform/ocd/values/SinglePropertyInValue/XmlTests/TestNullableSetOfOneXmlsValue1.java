package com.dslplatform.ocd.values.SinglePropertyInValue.XmlTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneXmlsValue1;

public class TestNullableSetOfOneXmlsValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneXmlsValue1.class.getDeclaredField(
                        "nullableSetOfOneXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneXmlsValue1.class.getDeclaredField(
                        "nullableSetOfOneXmls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<org.w3c.dom.Element> nullableSetOfOneXmls = null;
                }.getClass().getDeclaredField("nullableSetOfOneXmls").getGenericType(),
                NullableSetOfOneXmlsValue1.class.getDeclaredField("nullableSetOfOneXmls").getGenericType());
    }
}
