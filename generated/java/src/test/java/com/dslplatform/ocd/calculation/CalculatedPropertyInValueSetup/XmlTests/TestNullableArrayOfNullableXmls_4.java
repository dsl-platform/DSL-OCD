package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.XmlTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableArrayOfNullableXmls_4;

public class TestNullableArrayOfNullableXmls_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableXmls_4.class.getDeclaredField(
                        "nullableArrayOfNullableXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.w3c.dom.Element[].class,
                NullableArrayOfNullableXmls_4.class.getDeclaredField(
                        "nullableArrayOfNullableXmls").getType());
    }
}
