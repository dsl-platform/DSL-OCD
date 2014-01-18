package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.LocationTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableLocations_3;

public class TestOneListOfNullableLocations_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableLocations_3.class.getDeclaredField(
                        "oneListOfNullableLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableLocations_3.class.getDeclaredField(
                        "oneListOfNullableLocations").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.awt.geom.Point2D> oneListOfNullableLocations = null;
                }.getClass().getDeclaredField("oneListOfNullableLocations").getGenericType(),
                OneListOfNullableLocations_3.class.getDeclaredField("oneListOfNullableLocations").getGenericType());
    }
}
