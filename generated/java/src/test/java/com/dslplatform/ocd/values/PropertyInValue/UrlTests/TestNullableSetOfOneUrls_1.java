package com.dslplatform.ocd.values.PropertyInValue.UrlTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableSetOfOneUrls_1;

public class TestNullableSetOfOneUrls_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneUrls_1.class.getDeclaredField(
                        "nullableSetOfOneUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneUrls_1.class.getDeclaredField(
                        "nullableSetOfOneUrls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.net.URI> nullableSetOfOneUrls = null;
                }.getClass().getDeclaredField("nullableSetOfOneUrls").getGenericType(),
                NullableSetOfOneUrls_1.class.getDeclaredField("nullableSetOfOneUrls").getGenericType());
    }
}
