package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.XmlTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableXmls_3;

public class TestNullableSetOfNullableXmls_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableXmls_3.class.getDeclaredField(
                        "nullableSetOfNullableXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableXmls_3.class.getDeclaredField(
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
                NullableSetOfNullableXmls_3.class.getDeclaredField("nullableSetOfNullableXmls").getGenericType());
    }
}
