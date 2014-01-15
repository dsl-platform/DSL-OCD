package com.dslplatform.ocd.values.SinglePropertyInValue.UrlTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableUrlsValue8;

public class TestOneArrayOfNullableUrlsValue8 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableUrlsValue8.class.getDeclaredField(
                        "oneArrayOfNullableUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.URL[].class,
                OneArrayOfNullableUrlsValue8.class.getDeclaredField(
                        "oneArrayOfNullableUrls").getType());
    }
}
