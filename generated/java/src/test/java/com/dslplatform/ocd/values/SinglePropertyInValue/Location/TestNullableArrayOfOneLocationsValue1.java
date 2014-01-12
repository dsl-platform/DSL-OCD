package com.dslplatform.ocd.values.SinglePropertyInValue.Location;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneLocationsValue1;
import org.scalatest._;

public class TestNullableArrayOfOneLocationsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneLocationsValue1.class.getDeclaredField(
                        "nullableArrayOfOneLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D[].class,
                NullableArrayOfOneLocationsValue1.class.getDeclaredField(
                        "nullableArrayOfOneLocations").getType());
    }
}
