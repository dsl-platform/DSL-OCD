package com.dslplatform.ocd.values.SinglePropertyInValue.LocationTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneLocationsValue3;

public class TestNullableSetOfOneLocationsValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneLocationsValue3.class.getDeclaredField(
                        "nullableSetOfOneLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneLocationsValue3.class.getDeclaredField(
                        "nullableSetOfOneLocations").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.geom.Point2D> nullableSetOfOneLocations = null;
                }.getClass().getDeclaredField("nullableSetOfOneLocations").getGenericType(),
                NullableSetOfOneLocationsValue3.class.getDeclaredField("nullableSetOfOneLocations").getGenericType());
    }
}
