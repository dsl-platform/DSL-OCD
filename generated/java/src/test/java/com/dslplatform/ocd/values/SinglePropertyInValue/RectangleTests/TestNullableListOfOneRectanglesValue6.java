package com.dslplatform.ocd.values.SinglePropertyInValue.RectangleTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneRectanglesValue6;

public class TestNullableListOfOneRectanglesValue6 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneRectanglesValue6.class.getDeclaredField(
                        "nullableListOfOneRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneRectanglesValue6.class.getDeclaredField(
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
                NullableListOfOneRectanglesValue6.class.getDeclaredField("nullableListOfOneRectangles").getGenericType());
    }
}
