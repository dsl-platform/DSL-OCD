package com.dslplatform.ocd.values.PropertyInValue.UrlTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableListOfNullableUrls_1;

public class TestNullableListOfNullableUrls_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableUrls_1.class.getDeclaredField(
                        "nullableListOfNullableUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableUrls_1.class.getDeclaredField(
                        "nullableListOfNullableUrls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.net.URI> nullableListOfNullableUrls = null;
                }.getClass().getDeclaredField("nullableListOfNullableUrls").getGenericType(),
                NullableListOfNullableUrls_1.class.getDeclaredField("nullableListOfNullableUrls").getGenericType());
    }
}
