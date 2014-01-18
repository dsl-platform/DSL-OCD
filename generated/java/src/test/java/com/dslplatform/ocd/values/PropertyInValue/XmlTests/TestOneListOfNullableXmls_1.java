package com.dslplatform.ocd.values.PropertyInValue.XmlTests;

import com.dslplatform.ocd.values.PropertyInValue.OneListOfNullableXmls_1;

public class TestOneListOfNullableXmls_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableXmls_1.class.getDeclaredField(
                        "oneListOfNullableXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableXmls_1.class.getDeclaredField(
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
                OneListOfNullableXmls_1.class.getDeclaredField("oneListOfNullableXmls").getGenericType());
    }
}
