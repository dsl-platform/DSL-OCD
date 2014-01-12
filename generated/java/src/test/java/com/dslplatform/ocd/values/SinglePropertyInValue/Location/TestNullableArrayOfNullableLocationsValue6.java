package com.dslplatform.ocd.values.SinglePropertyInValue.Location;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableLocationsValue6;
import org.scalatest._;

public class TestNullableArrayOfNullableLocationsValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableLocationsValue6.class.getDeclaredField(
                        "nullableArrayOfNullableLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D[].class,
                NullableArrayOfNullableLocationsValue6.class.getDeclaredField(
                        "nullableArrayOfNullableLocations").getType());
    }
}
