package com.dslplatform.ocd.values.PropertyInValue.UrlTests;

import com.dslplatform.ocd.values.PropertyInValue.OneListOfOneUrls_1;

public class TestOneListOfOneUrls_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneUrls_1.class.getDeclaredField(
                        "oneListOfOneUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneUrls_1.class.getDeclaredField(
                        "oneListOfOneUrls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.net.URI> oneListOfOneUrls = null;
                }.getClass().getDeclaredField("oneListOfOneUrls").getGenericType(),
                OneListOfOneUrls_1.class.getDeclaredField("oneListOfOneUrls").getGenericType());
    }
}
