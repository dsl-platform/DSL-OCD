package com.dslplatform.ocd.values.SinglePropertyInValue.ImageTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableImagesValue2;

public class TestOneArrayOfNullableImagesValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableImagesValue2.class.getDeclaredField(
                        "oneArrayOfNullableImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.image.BufferedImage[].class,
                OneArrayOfNullableImagesValue2.class.getDeclaredField(
                        "oneArrayOfNullableImages").getType());
    }
}
