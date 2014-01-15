package com.dslplatform.ocd.values.SinglePropertyInValue.RectangleTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneRectanglesValue6;

public class TestNullableSetOfOneRectanglesValue6 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneRectanglesValue6.class.getDeclaredField(
                        "nullableSetOfOneRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneRectanglesValue6.class.getDeclaredField(
                        "nullableSetOfOneRectangles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfOneRectangles = null;
                }.getClass().getDeclaredField("nullableSetOfOneRectangles").getGenericType(),
                NullableSetOfOneRectanglesValue6.class.getDeclaredField("nullableSetOfOneRectangles").getGenericType());
    }
}
