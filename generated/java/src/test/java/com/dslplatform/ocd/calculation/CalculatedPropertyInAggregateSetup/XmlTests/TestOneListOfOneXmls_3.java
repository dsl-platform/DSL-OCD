package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.XmlTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneXmls_3;

public class TestOneListOfOneXmls_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneXmls_3.class.getDeclaredField(
                        "oneListOfOneXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneXmls_3.class.getDeclaredField(
                        "oneListOfOneXmls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<org.w3c.dom.Element> oneListOfOneXmls = null;
                }.getClass().getDeclaredField("oneListOfOneXmls").getGenericType(),
                OneListOfOneXmls_3.class.getDeclaredField("oneListOfOneXmls").getGenericType());
    }
}
