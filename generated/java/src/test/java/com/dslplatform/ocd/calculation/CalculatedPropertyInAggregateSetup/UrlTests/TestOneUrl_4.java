package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.UrlTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneUrl_4;

public class TestOneUrl_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneUrl_4.class.getDeclaredField(
                        "oneUrl").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.URI.class,
                OneUrl_4.class.getDeclaredField(
                        "oneUrl").getType());
    }
}
