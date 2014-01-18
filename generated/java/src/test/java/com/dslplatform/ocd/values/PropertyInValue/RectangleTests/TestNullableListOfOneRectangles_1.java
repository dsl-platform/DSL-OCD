package com.dslplatform.ocd.values.PropertyInValue.RectangleTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableListOfOneRectangles_1;

public class TestNullableListOfOneRectangles_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneRectangles_1.class.getDeclaredField(
                        "nullableListOfOneRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneRectangles_1.class.getDeclaredField(
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
                NullableListOfOneRectangles_1.class.getDeclaredField("nullableListOfOneRectangles").getGenericType());
    }
}
