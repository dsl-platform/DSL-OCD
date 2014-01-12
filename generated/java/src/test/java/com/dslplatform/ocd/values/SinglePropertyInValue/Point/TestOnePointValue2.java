package com.dslplatform.ocd.values.SinglePropertyInValue.Point;

import com.dslplatform.ocd.values.SinglePropertyInValue.OnePointValue2;
import org.scalatest._;

public class TestOnePointValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OnePointValue2.class.getDeclaredField(
                        "onePoint").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D.class,
                OnePointValue2.class.getDeclaredField(
                        "onePoint").getType());
    }
}
