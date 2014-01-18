package com.dslplatform.ocd.values.PropertyInValue.LocationTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfNullableLocations_1;

public class TestOneArrayOfNullableLocations_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableLocations_1.class.getDeclaredField(
                        "oneArrayOfNullableLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D[].class,
                OneArrayOfNullableLocations_1.class.getDeclaredField(
                        "oneArrayOfNullableLocations").getType());
    }
}
