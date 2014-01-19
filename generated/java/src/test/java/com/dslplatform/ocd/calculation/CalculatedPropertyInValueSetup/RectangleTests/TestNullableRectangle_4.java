package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.RectangleTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableRectangle_4;

public class TestNullableRectangle_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableRectangle_4.class.getDeclaredField(
                        "nullableRectangle").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Rectangle2D.class,
                NullableRectangle_4.class.getDeclaredField(
                        "nullableRectangle").getType());
    }
}
