package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.PointTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullablePoints_3;

public class TestOneListOfNullablePoints_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullablePoints_3.class.getDeclaredField(
                        "oneListOfNullablePoints").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullablePoints_3.class.getDeclaredField(
                        "oneListOfNullablePoints").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.awt.geom.Point2D> oneListOfNullablePoints = null;
                }.getClass().getDeclaredField("oneListOfNullablePoints").getGenericType(),
                OneListOfNullablePoints_3.class.getDeclaredField("oneListOfNullablePoints").getGenericType());
    }
}
