package com.dslplatform.ocd.values.SinglePropertyInValue.RectangleTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableRectanglesValue9;

public class TestOneArrayOfNullableRectanglesValue9 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableRectanglesValue9.class.getDeclaredField(
                        "oneArrayOfNullableRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Rectangle2D[].class,
                OneArrayOfNullableRectanglesValue9.class.getDeclaredField(
                        "oneArrayOfNullableRectangles").getType());
    }
}
