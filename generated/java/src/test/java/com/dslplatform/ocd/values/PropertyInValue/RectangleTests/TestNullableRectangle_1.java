package com.dslplatform.ocd.values.PropertyInValue.RectangleTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableRectangle_1;

public class TestNullableRectangle_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableRectangle_1.class.getDeclaredField(
                        "nullableRectangle").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Rectangle2D.class,
                NullableRectangle_1.class.getDeclaredField(
                        "nullableRectangle").getType());
    }
}
