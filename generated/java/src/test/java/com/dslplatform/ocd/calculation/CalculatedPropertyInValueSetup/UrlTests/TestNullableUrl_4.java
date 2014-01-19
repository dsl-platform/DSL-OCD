package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.UrlTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableUrl_4;

public class TestNullableUrl_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableUrl_4.class.getDeclaredField(
                        "nullableUrl").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.URI.class,
                NullableUrl_4.class.getDeclaredField(
                        "nullableUrl").getType());
    }
}
