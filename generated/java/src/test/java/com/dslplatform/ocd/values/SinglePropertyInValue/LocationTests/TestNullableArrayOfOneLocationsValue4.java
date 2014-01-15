package com.dslplatform.ocd.values.SinglePropertyInValue.LocationTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneLocationsValue4;

public class TestNullableArrayOfOneLocationsValue4 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneLocationsValue4.class.getDeclaredField(
                        "nullableArrayOfOneLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D[].class,
                NullableArrayOfOneLocationsValue4.class.getDeclaredField(
                        "nullableArrayOfOneLocations").getType());
    }
}
