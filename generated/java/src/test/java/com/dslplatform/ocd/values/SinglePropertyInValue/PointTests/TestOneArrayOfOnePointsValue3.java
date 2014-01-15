package com.dslplatform.ocd.values.SinglePropertyInValue.PointTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOnePointsValue3;

public class TestOneArrayOfOnePointsValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOnePointsValue3.class.getDeclaredField(
                        "oneArrayOfOnePoints").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D[].class,
                OneArrayOfOnePointsValue3.class.getDeclaredField(
                        "oneArrayOfOnePoints").getType());
    }
}
