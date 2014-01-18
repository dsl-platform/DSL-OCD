package com.dslplatform.ocd.values.PropertyInValue.PointTests;

import com.dslplatform.ocd.values.PropertyInValue.OnePoint_1;

public class TestOnePoint_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OnePoint_1.class.getDeclaredField(
                        "onePoint").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D.class,
                OnePoint_1.class.getDeclaredField(
                        "onePoint").getType());
    }
}
