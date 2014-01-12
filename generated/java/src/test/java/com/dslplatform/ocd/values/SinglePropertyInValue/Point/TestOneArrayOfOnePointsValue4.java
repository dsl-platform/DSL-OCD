package com.dslplatform.ocd.values.SinglePropertyInValue.Point;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOnePointsValue4;
import org.scalatest._;

public class TestOneArrayOfOnePointsValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOnePointsValue4.class.getDeclaredField(
                        "oneArrayOfOnePoints").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D[].class,
                OneArrayOfOnePointsValue4.class.getDeclaredField(
                        "oneArrayOfOnePoints").getType());
    }
}
