package com.dslplatform.ocd.values.SinglePropertyInValue.RectangleTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneRectanglesValue1;

public class TestNullableListOfOneRectanglesValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneRectanglesValue1.class.getDeclaredField(
                        "nullableListOfOneRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneRectanglesValue1.class.getDeclaredField(
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
                NullableListOfOneRectanglesValue1.class.getDeclaredField("nullableListOfOneRectangles").getGenericType());
    }
}
