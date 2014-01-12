package com.dslplatform.ocd.values.SinglePropertyInValue.Image;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableImagesValue2;
import org.scalatest._;

public class TestNullableListOfNullableImagesValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableImagesValue2.class.getDeclaredField(
                        "nullableListOfNullableImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableImagesValue2.class.getDeclaredField(
                        "nullableListOfNullableImages").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.awt.image.BufferedImage> nullableListOfNullableImages = null;
                }.getClass().getDeclaredField("nullableListOfNullableImages").getGenericType(),
                NullableListOfNullableImagesValue2.class.getDeclaredField("nullableListOfNullableImages").getGenericType());
    }
}
