package com.dslplatform.ocd.values.SinglePropertyInValue.RectangleTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneRectanglesValue1;

public class TestOneListOfOneRectanglesValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneRectanglesValue1.class.getDeclaredField(
                        "oneListOfOneRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneRectanglesValue1.class.getDeclaredField(
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
                OneListOfOneRectanglesValue1.class.getDeclaredField("oneListOfOneRectangles").getGenericType());
    }
}
