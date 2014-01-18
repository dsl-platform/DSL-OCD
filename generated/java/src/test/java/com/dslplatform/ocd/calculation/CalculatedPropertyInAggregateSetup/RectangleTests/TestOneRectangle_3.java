package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.RectangleTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneRectangle_3;

public class TestOneRectangle_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneRectangle_3.class.getDeclaredField(
                        "oneRectangle").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Rectangle2D.class,
                OneRectangle_3.class.getDeclaredField(
                        "oneRectangle").getType());
    }
}
