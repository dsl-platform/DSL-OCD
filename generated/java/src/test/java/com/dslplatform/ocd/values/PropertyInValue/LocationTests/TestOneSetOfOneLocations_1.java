package com.dslplatform.ocd.values.PropertyInValue.LocationTests;

import com.dslplatform.ocd.values.PropertyInValue.OneSetOfOneLocations_1;

public class TestOneSetOfOneLocations_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneLocations_1.class.getDeclaredField(
                        "oneSetOfOneLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneLocations_1.class.getDeclaredField(
                        "oneSetOfOneLocations").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.geom.Point2D> oneSetOfOneLocations = null;
                }.getClass().getDeclaredField("oneSetOfOneLocations").getGenericType(),
                OneSetOfOneLocations_1.class.getDeclaredField("oneSetOfOneLocations").getGenericType());
    }
}
