package com.dslplatform.ocd.values.SinglePropertyInValue.Location;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableLocationsValue1;
import org.scalatest._;

public class TestNullableSetOfNullableLocationsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableLocationsValue1.class.getDeclaredField(
                        "nullableSetOfNullableLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableLocationsValue1.class.getDeclaredField(
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
                NullableSetOfNullableLocationsValue1.class.getDeclaredField("nullableSetOfNullableLocations").getGenericType());
    }
}
