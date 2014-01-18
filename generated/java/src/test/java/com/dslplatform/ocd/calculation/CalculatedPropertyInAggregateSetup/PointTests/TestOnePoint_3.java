package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.PointTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OnePoint_3;

public class TestOnePoint_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OnePoint_3.class.getDeclaredField(
                        "onePoint").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D.class,
                OnePoint_3.class.getDeclaredField(
                        "onePoint").getType());
    }
}
