package com.dslplatform.ocd.values.SinglePropertyInValue.PointTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OnePointValue1;

public class TestOnePointValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OnePointValue1.class.getDeclaredField(
                        "onePoint").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D.class,
                OnePointValue1.class.getDeclaredField(
                        "onePoint").getType());
    }
}
