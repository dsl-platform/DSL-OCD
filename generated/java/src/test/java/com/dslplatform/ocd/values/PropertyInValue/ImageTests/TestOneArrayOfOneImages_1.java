package com.dslplatform.ocd.values.PropertyInValue.ImageTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfOneImages_1;

public class TestOneArrayOfOneImages_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneImages_1.class.getDeclaredField(
                        "oneArrayOfOneImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.image.BufferedImage[].class,
                OneArrayOfOneImages_1.class.getDeclaredField(
                        "oneArrayOfOneImages").getType());
    }
}
