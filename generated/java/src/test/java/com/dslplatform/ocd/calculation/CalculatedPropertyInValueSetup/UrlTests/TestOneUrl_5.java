package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.UrlTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneUrl_5;

public class TestOneUrl_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneUrl_5.class.getDeclaredField(
                        "oneUrl").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.URI.class,
                OneUrl_5.class.getDeclaredField(
                        "oneUrl").getType());
    }
}
