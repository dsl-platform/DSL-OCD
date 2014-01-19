package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.RectangleTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneListOfNullableRectangles_4;

public class TestOneListOfNullableRectangles_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableRectangles_4.class.getDeclaredField(
                        "oneListOfNullableRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableRectangles_4.class.getDeclaredField(
                        "oneListOfNullableRectangles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.awt.geom.Rectangle2D> oneListOfNullableRectangles = null;
                }.getClass().getDeclaredField("oneListOfNullableRectangles").getGenericType(),
                OneListOfNullableRectangles_4.class.getDeclaredField("oneListOfNullableRectangles").getGenericType());
    }
}