package com.dslplatform.ocd.values.SinglePropertyInValue.Location;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableLocationsValue2;
import org.scalatest._;

public class TestNullableListOfNullableLocationsValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableLocationsValue2.class.getDeclaredField(
                        "nullableListOfNullableLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableLocationsValue2.class.getDeclaredField(
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
                NullableListOfNullableLocationsValue2.class.getDeclaredField("nullableListOfNullableLocations").getGenericType());
    }
}
