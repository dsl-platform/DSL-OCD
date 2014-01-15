package com.dslplatform.ocd.values.SinglePropertyInValue.ImageTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneImagesValue4;

public class TestNullableSetOfOneImagesValue4 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneImagesValue4.class.getDeclaredField(
                        "nullableSetOfOneImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneImagesValue4.class.getDeclaredField(
                        "nullableSetOfOneImages").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.image.BufferedImage> nullableSetOfOneImages = null;
                }.getClass().getDeclaredField("nullableSetOfOneImages").getGenericType(),
                NullableSetOfOneImagesValue4.class.getDeclaredField("nullableSetOfOneImages").getGenericType());
    }
}
