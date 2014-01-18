package com.dslplatform.ocd.values.PropertyInValue.XmlTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableListOfNullableXmls_1;

public class TestNullableListOfNullableXmls_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableXmls_1.class.getDeclaredField(
                        "nullableListOfNullableXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableXmls_1.class.getDeclaredField(
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
                NullableListOfNullableXmls_1.class.getDeclaredField("nullableListOfNullableXmls").getGenericType());
    }
}
