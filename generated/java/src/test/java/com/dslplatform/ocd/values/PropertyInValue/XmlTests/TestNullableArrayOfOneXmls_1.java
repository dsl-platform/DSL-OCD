package com.dslplatform.ocd.values.PropertyInValue.XmlTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableArrayOfOneXmls_1;

public class TestNullableArrayOfOneXmls_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneXmls_1.class.getDeclaredField(
                        "nullableArrayOfOneXmls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.w3c.dom.Element[].class,
                NullableArrayOfOneXmls_1.class.getDeclaredField(
                        "nullableArrayOfOneXmls").getType());
    }
}
