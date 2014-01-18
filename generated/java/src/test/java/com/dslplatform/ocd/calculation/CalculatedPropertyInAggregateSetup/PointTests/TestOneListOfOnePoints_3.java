package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.PointTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOnePoints_3;

public class TestOneListOfOnePoints_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOnePoints_3.class.getDeclaredField(
                        "oneListOfOnePoints").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOnePoints_3.class.getDeclaredField(
                        "oneListOfOnePoints").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.awt.geom.Point2D> oneListOfOnePoints = null;
                }.getClass().getDeclaredField("oneListOfOnePoints").getGenericType(),
                OneListOfOnePoints_3.class.getDeclaredField("oneListOfOnePoints").getGenericType());
    }
}
