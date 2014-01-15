package com.dslplatform.ocd.values.SinglePropertyInValue.RectangleTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableRectanglesValue2;

public class TestNullableSetOfNullableRectanglesValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableRectanglesValue2.class.getDeclaredField(
                        "nullableSetOfNullableRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableRectanglesValue2.class.getDeclaredField(
                        "nullableSetOfNullableRectangles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfNullableRectangles = null;
                }.getClass().getDeclaredField("nullableSetOfNullableRectangles").getGenericType(),
                NullableSetOfNullableRectanglesValue2.class.getDeclaredField("nullableSetOfNullableRectangles").getGenericType());
    }
}
