package com.dslplatform.ocd.values.SinglePropertyInValue.RectangleTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableRectanglesValue2;

public class TestOneSetOfNullableRectanglesValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableRectanglesValue2.class.getDeclaredField(
                        "oneSetOfNullableRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableRectanglesValue2.class.getDeclaredField(
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
                OneSetOfNullableRectanglesValue2.class.getDeclaredField("oneSetOfNullableRectangles").getGenericType());
    }
}
