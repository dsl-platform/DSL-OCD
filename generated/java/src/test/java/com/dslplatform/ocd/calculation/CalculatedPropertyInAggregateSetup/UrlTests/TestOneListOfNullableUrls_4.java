package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.UrlTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableUrls_4;

public class TestOneListOfNullableUrls_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableUrls_4.class.getDeclaredField(
                        "oneListOfNullableUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableUrls_4.class.getDeclaredField(
                        "oneListOfNullableUrls").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.net.URI> oneListOfNullableUrls = null;
                }.getClass().getDeclaredField("oneListOfNullableUrls").getGenericType(),
                OneListOfNullableUrls_4.class.getDeclaredField("oneListOfNullableUrls").getGenericType());
    }
}
