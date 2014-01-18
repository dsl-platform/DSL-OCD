package com.dslplatform.ocd.values.PropertyInValue.RectangleTests;

import com.dslplatform.ocd.values.PropertyInValue.OneSetOfNullableRectangles_1;

public class TestOneSetOfNullableRectangles_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableRectangles_1.class.getDeclaredField(
                        "oneSetOfNullableRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableRectangles_1.class.getDeclaredField(
                        "oneSetOfNullableRectangles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.geom.Rectangle2D> oneSetOfNullableRectangles = null;
                }.getClass().getDeclaredField("oneSetOfNullableRectangles").getGenericType(),
                OneSetOfNullableRectangles_1.class.getDeclaredField("oneSetOfNullableRectangles").getGenericType());
    }
}
