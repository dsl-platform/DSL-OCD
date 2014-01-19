package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.RectangleTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableListOfOneRectangles_4;

public class TestNullableListOfOneRectangles_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneRectangles_4.class.getDeclaredField(
                        "nullableListOfOneRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneRectangles_4.class.getDeclaredField(
                        "nullableListOfOneRectangles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.awt.geom.Rectangle2D> nullableListOfOneRectangles = null;
                }.getClass().getDeclaredField("nullableListOfOneRectangles").getGenericType(),
                NullableListOfOneRectangles_4.class.getDeclaredField("nullableListOfOneRectangles").getGenericType());
    }
}
