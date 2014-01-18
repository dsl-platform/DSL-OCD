package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.UrlTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableUrls_2;

public class TestOneSetOfNullableUrls_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableUrls_2.class.getDeclaredField(
                        "oneSetOfNullableUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableUrls_2.class.getDeclaredField(
                        "oneSetOfNullableUrls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.net.URI> oneSetOfNullableUrls = null;
                }.getClass().getDeclaredField("oneSetOfNullableUrls").getGenericType(),
                OneSetOfNullableUrls_2.class.getDeclaredField("oneSetOfNullableUrls").getGenericType());
    }
}
