package com.dslplatform.ocd.values.PropertyInValue.PointTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfOnePoints_1;

public class TestOneArrayOfOnePoints_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOnePoints_1.class.getDeclaredField(
                        "oneArrayOfOnePoints").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D[].class,
                OneArrayOfOnePoints_1.class.getDeclaredField(
                        "oneArrayOfOnePoints").getType());
    }
}
