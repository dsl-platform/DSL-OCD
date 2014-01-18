package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.RectangleTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneRectangles_3;

public class TestOneSetOfOneRectangles_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneRectangles_3.class.getDeclaredField(
                        "oneSetOfOneRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneRectangles_3.class.getDeclaredField(
                        "oneSetOfOneRectangles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.geom.Rectangle2D> oneSetOfOneRectangles = null;
                }.getClass().getDeclaredField("oneSetOfOneRectangles").getGenericType(),
                OneSetOfOneRectangles_3.class.getDeclaredField("oneSetOfOneRectangles").getGenericType());
    }
}
