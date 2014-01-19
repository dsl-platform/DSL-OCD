package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.XmlTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneArrayOfNullableXmls_4;

public class TestOneArrayOfNullableXmls_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableXmls_4.class.getDeclaredField(
                        "oneArrayOfNullableXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.w3c.dom.Element[].class,
                OneArrayOfNullableXmls_4.class.getDeclaredField(
                        "oneArrayOfNullableXmls").getType());
    }
}
