package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.XmlTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneListOfNullableXmls_4;

public class TestOneListOfNullableXmls_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableXmls_4.class.getDeclaredField(
                        "oneListOfNullableXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableXmls_4.class.getDeclaredField(
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
                OneListOfNullableXmls_4.class.getDeclaredField("oneListOfNullableXmls").getGenericType());
    }
}
