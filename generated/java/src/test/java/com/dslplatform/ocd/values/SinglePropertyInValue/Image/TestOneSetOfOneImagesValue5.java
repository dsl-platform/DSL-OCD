package com.dslplatform.ocd.values.SinglePropertyInValue.Image;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneImagesValue5;
import org.scalatest._;

public class TestOneSetOfOneImagesValue5 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneImagesValue5.class.getDeclaredField(
                        "oneSetOfOneImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneImagesValue5.class.getDeclaredField(
                        "oneSetOfOneImages").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.image.BufferedImage> oneSetOfOneImages = null;
                }.getClass().getDeclaredField("oneSetOfOneImages").getGenericType(),
                OneSetOfOneImagesValue5.class.getDeclaredField("oneSetOfOneImages").getGenericType());
    }
}
