package com.dslplatform.ocd.values.SinglePropertyInValue.Image;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableImagesValue5;
import org.scalatest._;

public class TestOneSetOfNullableImagesValue5 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableImagesValue5.class.getDeclaredField(
                        "oneSetOfNullableImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableImagesValue5.class.getDeclaredField(
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
                OneSetOfNullableImagesValue5.class.getDeclaredField("oneSetOfNullableImages").getGenericType());
    }
}
