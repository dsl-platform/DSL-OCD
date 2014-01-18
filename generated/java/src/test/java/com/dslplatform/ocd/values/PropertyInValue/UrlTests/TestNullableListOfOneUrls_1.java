package com.dslplatform.ocd.values.PropertyInValue.UrlTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableListOfOneUrls_1;

public class TestNullableListOfOneUrls_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneUrls_1.class.getDeclaredField(
                        "nullableListOfOneUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneUrls_1.class.getDeclaredField(
                        "nullableListOfOneUrls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.net.URI> nullableListOfOneUrls = null;
                }.getClass().getDeclaredField("nullableListOfOneUrls").getGenericType(),
                NullableListOfOneUrls_1.class.getDeclaredField("nullableListOfOneUrls").getGenericType());
    }
}
