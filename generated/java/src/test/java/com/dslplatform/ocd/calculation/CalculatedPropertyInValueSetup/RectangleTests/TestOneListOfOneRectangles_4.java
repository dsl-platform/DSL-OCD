package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.RectangleTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneListOfOneRectangles_4;

public class TestOneListOfOneRectangles_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneRectangles_4.class.getDeclaredField(
                        "oneListOfOneRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneRectangles_4.class.getDeclaredField(
                        "oneListOfOneRectangles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.awt.geom.Rectangle2D> oneListOfOneRectangles = null;
                }.getClass().getDeclaredField("oneListOfOneRectangles").getGenericType(),
                OneListOfOneRectangles_4.class.getDeclaredField("oneListOfOneRectangles").getGenericType());
    }
}
