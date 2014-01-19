package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.PointTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OnePoint_4;

public class TestOnePoint_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OnePoint_4.class.getDeclaredField(
                        "onePoint").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D.class,
                OnePoint_4.class.getDeclaredField(
                        "onePoint").getType());
    }
}
