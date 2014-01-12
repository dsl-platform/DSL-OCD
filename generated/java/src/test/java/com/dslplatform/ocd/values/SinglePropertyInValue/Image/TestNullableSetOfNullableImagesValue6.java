package com.dslplatform.ocd.values.SinglePropertyInValue.Image;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableImagesValue6;
import org.scalatest._;

public class TestNullableSetOfNullableImagesValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableImagesValue6.class.getDeclaredField(
                        "nullableSetOfNullableImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableImagesValue6.class.getDeclaredField(
                        "nullableSetOfNullableImages").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.image.BufferedImage> nullableSetOfNullableImages = null;
                }.getClass().getDeclaredField("nullableSetOfNullableImages").getGenericType(),
                NullableSetOfNullableImagesValue6.class.getDeclaredField("nullableSetOfNullableImages").getGenericType());
    }
}
