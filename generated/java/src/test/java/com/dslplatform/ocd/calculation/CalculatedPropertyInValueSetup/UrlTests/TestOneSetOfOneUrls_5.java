package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.UrlTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneSetOfOneUrls_5;

public class TestOneSetOfOneUrls_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneUrls_5.class.getDeclaredField(
                        "oneSetOfOneUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneUrls_5.class.getDeclaredField(
                        "oneSetOfOneUrls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.net.URI> oneSetOfOneUrls = null;
                }.getClass().getDeclaredField("oneSetOfOneUrls").getGenericType(),
                OneSetOfOneUrls_5.class.getDeclaredField("oneSetOfOneUrls").getGenericType());
    }
}
