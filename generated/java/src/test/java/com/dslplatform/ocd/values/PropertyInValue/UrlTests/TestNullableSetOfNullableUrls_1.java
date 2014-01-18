package com.dslplatform.ocd.values.PropertyInValue.UrlTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableSetOfNullableUrls_1;

public class TestNullableSetOfNullableUrls_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableUrls_1.class.getDeclaredField(
                        "nullableSetOfNullableUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableUrls_1.class.getDeclaredField(
                        "nullableSetOfNullableUrls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.net.URI> nullableSetOfNullableUrls = null;
                }.getClass().getDeclaredField("nullableSetOfNullableUrls").getGenericType(),
                NullableSetOfNullableUrls_1.class.getDeclaredField("nullableSetOfNullableUrls").getGenericType());
    }
}
