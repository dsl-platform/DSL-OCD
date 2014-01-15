package com.dslplatform.ocd.values.SinglePropertyInValue.ImageTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableImagesValue4;

public class TestNullableArrayOfNullableImagesValue4 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableImagesValue4.class.getDeclaredField(
                        "nullableArrayOfNullableImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.image.BufferedImage[].class,
                NullableArrayOfNullableImagesValue4.class.getDeclaredField(
                        "nullableArrayOfNullableImages").getType());
    }
}
