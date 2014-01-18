package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.UrlTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableUrls_2;

public class TestOneArrayOfNullableUrls_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableUrls_2.class.getDeclaredField(
                        "oneArrayOfNullableUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.URI[].class,
                OneArrayOfNullableUrls_2.class.getDeclaredField(
                        "oneArrayOfNullableUrls").getType());
    }
}
