package com.dslplatform.ocd.values.SinglePropertyInValue.Location;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableLocationsValue3;
import org.scalatest._;

public class TestNullableArrayOfNullableLocationsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableLocationsValue3.class.getDeclaredField(
                        "nullableArrayOfNullableLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D[].class,
                NullableArrayOfNullableLocationsValue3.class.getDeclaredField(
                        "nullableArrayOfNullableLocations").getType());
    }
}
