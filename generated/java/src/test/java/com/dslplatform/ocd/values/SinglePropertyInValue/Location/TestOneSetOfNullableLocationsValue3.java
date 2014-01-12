package com.dslplatform.ocd.values.SinglePropertyInValue.Location;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableLocationsValue3;
import org.scalatest._;

public class TestOneSetOfNullableLocationsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableLocationsValue3.class.getDeclaredField(
                        "oneSetOfNullableLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableLocationsValue3.class.getDeclaredField(
                        "oneSetOfNullableLocations").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.geom.Point2D> oneSetOfNullableLocations = null;
                }.getClass().getDeclaredField("oneSetOfNullableLocations").getGenericType(),
                OneSetOfNullableLocationsValue3.class.getDeclaredField("oneSetOfNullableLocations").getGenericType());
    }
}
