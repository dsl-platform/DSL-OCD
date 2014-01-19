package com.dslplatform.ocd.values.PropertyInValue.UrlTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfOneUrls_1;

public class TestOneArrayOfOneUrls_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneUrls_1.class.getDeclaredField(
                        "oneArrayOfOneUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.URI[].class,
                OneArrayOfOneUrls_1.class.getDeclaredField(
                        "oneArrayOfOneUrls").getType());
    }
}