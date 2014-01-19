package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.ImageTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneSetOfNullableImages_5;

public class TestOneSetOfNullableImages_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableImages_5.class.getDeclaredField(
                        "oneSetOfNullableImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableImages_5.class.getDeclaredField(
                        "oneSetOfNullableImages").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.image.BufferedImage> oneSetOfNullableImages = null;
                }.getClass().getDeclaredField("oneSetOfNullableImages").getGenericType(),
                OneSetOfNullableImages_5.class.getDeclaredField("oneSetOfNullableImages").getGenericType());
    }
}
