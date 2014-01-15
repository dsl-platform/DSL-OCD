package com.dslplatform.ocd.values.SinglePropertyInValue.ImageTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneImagesValue3;

public class TestOneArrayOfOneImagesValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneImagesValue3.class.getDeclaredField(
                        "oneArrayOfOneImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.image.BufferedImage[].class,
                OneArrayOfOneImagesValue3.class.getDeclaredField(
                        "oneArrayOfOneImages").getType());
    }
}
