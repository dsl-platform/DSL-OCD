package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.PointTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOnePoints_3;

public class TestNullableListOfOnePoints_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOnePoints_3.class.getDeclaredField(
                        "nullableListOfOnePoints").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOnePoints_3.class.getDeclaredField(
                        "nullableListOfOnePoints").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.awt.geom.Point2D> nullableListOfOnePoints = null;
                }.getClass().getDeclaredField("nullableListOfOnePoints").getGenericType(),
                NullableListOfOnePoints_3.class.getDeclaredField("nullableListOfOnePoints").getGenericType());
    }
}
