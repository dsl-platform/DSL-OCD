package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.LocationTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneArrayOfNullableLocations_4;

public class TestOneArrayOfNullableLocations_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableLocations_4.class.getDeclaredField(
                        "oneArrayOfNullableLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D[].class,
                OneArrayOfNullableLocations_4.class.getDeclaredField(
                        "oneArrayOfNullableLocations").getType());
    }
}
