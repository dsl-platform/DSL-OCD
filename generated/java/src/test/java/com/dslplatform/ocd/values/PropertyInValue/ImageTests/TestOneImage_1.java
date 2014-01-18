package com.dslplatform.ocd.values.PropertyInValue.ImageTests;

import com.dslplatform.ocd.values.PropertyInValue.OneImage_1;

public class TestOneImage_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneImage_1.class.getDeclaredField(
                        "oneImage").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.image.BufferedImage.class,
                OneImage_1.class.getDeclaredField(
                        "oneImage").getType());
    }
}
