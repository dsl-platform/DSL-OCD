package com.dslplatform.ocd.values.SinglePropertyInValue.UrlTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneUrlsValue5;

public class TestNullableArrayOfOneUrlsValue5 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneUrlsValue5.class.getDeclaredField(
                        "nullableArrayOfOneUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.URL[].class,
                NullableArrayOfOneUrlsValue5.class.getDeclaredField(
                        "nullableArrayOfOneUrls").getType());
    }
}
