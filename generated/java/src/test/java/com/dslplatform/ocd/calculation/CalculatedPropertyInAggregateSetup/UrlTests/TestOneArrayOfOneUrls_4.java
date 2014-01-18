package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.UrlTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneUrls_4;

public class TestOneArrayOfOneUrls_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneUrls_4.class.getDeclaredField(
                        "oneArrayOfOneUrls").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.URI[].class,
                OneArrayOfOneUrls_4.class.getDeclaredField(
                        "oneArrayOfOneUrls").getType());
    }
}
