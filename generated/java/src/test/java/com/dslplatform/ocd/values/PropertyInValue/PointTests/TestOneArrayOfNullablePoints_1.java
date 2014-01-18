package com.dslplatform.ocd.values.PropertyInValue.PointTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfNullablePoints_1;

public class TestOneArrayOfNullablePoints_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullablePoints_1.class.getDeclaredField(
                        "oneArrayOfNullablePoints").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D[].class,
                OneArrayOfNullablePoints_1.class.getDeclaredField(
                        "oneArrayOfNullablePoints").getType());
    }
}
