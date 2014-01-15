package com.dslplatform.ocd.values.SinglePropertyInValue.RectangleTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableRectanglesValue3;

public class TestOneListOfNullableRectanglesValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableRectanglesValue3.class.getDeclaredField(
                        "oneListOfNullableRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableRectanglesValue3.class.getDeclaredField(
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
                OneListOfNullableRectanglesValue3.class.getDeclaredField("oneListOfNullableRectangles").getGenericType());
    }
}
