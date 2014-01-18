package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.XmlTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableXml_3;

public class TestNullableXml_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableXml_3.class.getDeclaredField(
                        "nullableXml").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.w3c.dom.Element.class,
                NullableXml_3.class.getDeclaredField(
                        "nullableXml").getType());
    }
}
