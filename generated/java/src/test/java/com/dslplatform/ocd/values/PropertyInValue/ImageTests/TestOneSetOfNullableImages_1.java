package com.dslplatform.ocd.values.PropertyInValue.ImageTests;

import com.dslplatform.ocd.values.PropertyInValue.OneSetOfNullableImages_1;

public class TestOneSetOfNullableImages_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableImages_1.class.getDeclaredField(
                        "oneSetOfNullableImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableImages_1.class.getDeclaredField(
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
                OneSetOfNullableImages_1.class.getDeclaredField("oneSetOfNullableImages").getGenericType());
    }
}
