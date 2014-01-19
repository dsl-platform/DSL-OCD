package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.LocationTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableSetOfNullableLocations_4;

public class TestNullableSetOfNullableLocations_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableLocations_4.class.getDeclaredField(
                        "nullableSetOfNullableLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableLocations_4.class.getDeclaredField(
                        "nullableSetOfNullableLocations").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.geom.Point2D> nullableSetOfNullableLocations = null;
                }.getClass().getDeclaredField("nullableSetOfNullableLocations").getGenericType(),
                NullableSetOfNullableLocations_4.class.getDeclaredField("nullableSetOfNullableLocations").getGenericType());
    }
}
