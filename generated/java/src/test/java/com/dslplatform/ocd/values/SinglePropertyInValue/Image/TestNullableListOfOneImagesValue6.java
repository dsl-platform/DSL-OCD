package com.dslplatform.ocd.values.SinglePropertyInValue.Image;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneImagesValue6;
import org.scalatest._;

public class TestNullableListOfOneImagesValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneImagesValue6.class.getDeclaredField(
                        "nullableListOfOneImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneImagesValue6.class.getDeclaredField(
                        "nullableListOfOneImages").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.awt.image.BufferedImage> nullableListOfOneImages = null;
                }.getClass().getDeclaredField("nullableListOfOneImages").getGenericType(),
                NullableListOfOneImagesValue6.class.getDeclaredField("nullableListOfOneImages").getGenericType());
    }
}
