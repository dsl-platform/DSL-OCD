package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.ImageTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableImages_4;

public class TestOneListOfNullableImages_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableImages_4.class.getDeclaredField(
                        "oneListOfNullableImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableImages_4.class.getDeclaredField(
                        "oneListOfNullableImages").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.awt.image.BufferedImage> oneListOfNullableImages = null;
                }.getClass().getDeclaredField("oneListOfNullableImages").getGenericType(),
                OneListOfNullableImages_4.class.getDeclaredField("oneListOfNullableImages").getGenericType());
    }
}