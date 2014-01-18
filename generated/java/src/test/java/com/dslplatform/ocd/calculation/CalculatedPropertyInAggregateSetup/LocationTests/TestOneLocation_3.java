package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.LocationTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneLocation_3;

public class TestOneLocation_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneLocation_3.class.getDeclaredField(
                        "oneLocation").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D.class,
                OneLocation_3.class.getDeclaredField(
                        "oneLocation").getType());
    }
}
