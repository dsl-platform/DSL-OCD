package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.LocationTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableLocations_3;

public class TestOneArrayOfNullableLocations_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableLocations_3.class.getDeclaredField(
                        "oneArrayOfNullableLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D[].class,
                OneArrayOfNullableLocations_3.class.getDeclaredField(
                        "oneArrayOfNullableLocations").getType());
    }
}
