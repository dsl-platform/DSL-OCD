package com.dslplatform.ocd.values.PropertyInValue.LocationTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfOneLocations_1;

public class TestOneArrayOfOneLocations_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneLocations_1.class.getDeclaredField(
                        "oneArrayOfOneLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D[].class,
                OneArrayOfOneLocations_1.class.getDeclaredField(
                        "oneArrayOfOneLocations").getType());
    }
}
