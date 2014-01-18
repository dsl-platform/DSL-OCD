package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.XmlTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableXmls_3;

public class TestNullableListOfNullableXmls_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableXmls_3.class.getDeclaredField(
                        "nullableListOfNullableXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableXmls_3.class.getDeclaredField(
                        "nullableListOfNullableXmls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<org.w3c.dom.Element> nullableListOfNullableXmls = null;
                }.getClass().getDeclaredField("nullableListOfNullableXmls").getGenericType(),
                NullableListOfNullableXmls_3.class.getDeclaredField("nullableListOfNullableXmls").getGenericType());
    }
}
