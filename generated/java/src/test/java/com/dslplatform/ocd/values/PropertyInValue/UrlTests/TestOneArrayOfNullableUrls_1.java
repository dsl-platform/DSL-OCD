package com.dslplatform.ocd.values.PropertyInValue.UrlTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfNullableUrls_1;

public class TestOneArrayOfNullableUrls_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableUrls_1.class.getDeclaredField(
                        "oneArrayOfNullableUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.URI[].class,
                OneArrayOfNullableUrls_1.class.getDeclaredField(
                        "oneArrayOfNullableUrls").getType());
    }
}
