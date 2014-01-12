package com.dslplatform.ocd.values.SinglePropertyInValue.Image;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableImagesValue9;
import org.scalatest._;

public class TestOneArrayOfNullableImagesValue9 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableImagesValue9.class.getDeclaredField(
                        "oneArrayOfNullableImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.image.BufferedImage[].class,
                OneArrayOfNullableImagesValue9.class.getDeclaredField(
                        "oneArrayOfNullableImages").getType());
    }
}
