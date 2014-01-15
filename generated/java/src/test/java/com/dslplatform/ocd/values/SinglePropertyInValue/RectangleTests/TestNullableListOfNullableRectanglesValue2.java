package com.dslplatform.ocd.values.SinglePropertyInValue.RectangleTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableRectanglesValue2;

public class TestNullableListOfNullableRectanglesValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableRectanglesValue2.class.getDeclaredField(
                        "nullableListOfNullableRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableRectanglesValue2.class.getDeclaredField(
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
                NullableListOfNullableRectanglesValue2.class.getDeclaredField("nullableListOfNullableRectangles").getGenericType());
    }
}
