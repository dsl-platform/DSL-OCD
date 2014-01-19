package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.ImageTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneImages_2;

public class TestOneListOfOneImages_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneImages_2.class.getDeclaredField(
                        "oneListOfOneImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneImages_2.class.getDeclaredField(
                        "oneListOfOneImages").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.awt.image.BufferedImage> oneListOfOneImages = null;
                }.getClass().getDeclaredField("oneListOfOneImages").getGenericType(),
                OneListOfOneImages_2.class.getDeclaredField("oneListOfOneImages").getGenericType());
    }
}