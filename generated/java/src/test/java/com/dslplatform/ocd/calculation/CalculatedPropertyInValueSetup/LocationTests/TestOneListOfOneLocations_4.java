package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.LocationTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneListOfOneLocations_4;

public class TestOneListOfOneLocations_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneLocations_4.class.getDeclaredField(
                        "oneListOfOneLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneLocations_4.class.getDeclaredField(
                        "oneListOfOneLocations").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.awt.geom.Point2D> oneListOfOneLocations = null;
                }.getClass().getDeclaredField("oneListOfOneLocations").getGenericType(),
                OneListOfOneLocations_4.class.getDeclaredField("oneListOfOneLocations").getGenericType());
    }
}
