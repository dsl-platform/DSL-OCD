package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.RectangleTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneRectangle_4;

public class TestOneRectangle_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneRectangle_4.class.getDeclaredField(
                        "oneRectangle").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Rectangle2D.class,
                OneRectangle_4.class.getDeclaredField(
                        "oneRectangle").getType());
    }
}
