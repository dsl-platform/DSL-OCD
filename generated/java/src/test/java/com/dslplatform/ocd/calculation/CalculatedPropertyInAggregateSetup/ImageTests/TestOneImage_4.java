package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.ImageTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneImage_4;

public class TestOneImage_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneImage_4.class.getDeclaredField(
                        "oneImage").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.image.BufferedImage.class,
                OneImage_4.class.getDeclaredField(
                        "oneImage").getType());
    }
}
