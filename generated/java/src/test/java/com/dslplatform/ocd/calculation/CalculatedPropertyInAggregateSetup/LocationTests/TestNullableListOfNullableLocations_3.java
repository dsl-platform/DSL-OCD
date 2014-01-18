package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.LocationTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableLocations_3;

public class TestNullableListOfNullableLocations_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableLocations_3.class.getDeclaredField(
                        "nullableListOfNullableLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableLocations_3.class.getDeclaredField(
                        "nullableListOfNullableLocations").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.awt.geom.Point2D> nullableListOfNullableLocations = null;
                }.getClass().getDeclaredField("nullableListOfNullableLocations").getGenericType(),
                NullableListOfNullableLocations_3.class.getDeclaredField("nullableListOfNullableLocations").getGenericType());
    }
}
