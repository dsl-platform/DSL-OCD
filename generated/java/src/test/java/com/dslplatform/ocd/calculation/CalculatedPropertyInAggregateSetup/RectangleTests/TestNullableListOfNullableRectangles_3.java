package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.RectangleTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableRectangles_3;

public class TestNullableListOfNullableRectangles_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableRectangles_3.class.getDeclaredField(
                        "nullableListOfNullableRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableRectangles_3.class.getDeclaredField(
                        "nullableListOfNullableRectangles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.awt.geom.Rectangle2D> nullableListOfNullableRectangles = null;
                }.getClass().getDeclaredField("nullableListOfNullableRectangles").getGenericType(),
                NullableListOfNullableRectangles_3.class.getDeclaredField("nullableListOfNullableRectangles").getGenericType());
    }
}
