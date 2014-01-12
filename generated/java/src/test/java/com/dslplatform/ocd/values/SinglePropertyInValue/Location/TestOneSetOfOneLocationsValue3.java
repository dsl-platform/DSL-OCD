package com.dslplatform.ocd.values.SinglePropertyInValue.Location;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneLocationsValue3;
import org.scalatest._;

public class TestOneSetOfOneLocationsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneLocationsValue3.class.getDeclaredField(
                        "oneSetOfOneLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneLocationsValue3.class.getDeclaredField(
                        "oneSetOfOneLocations").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.geom.Point2D> oneSetOfOneLocations = null;
                }.getClass().getDeclaredField("oneSetOfOneLocations").getGenericType(),
                OneSetOfOneLocationsValue3.class.getDeclaredField("oneSetOfOneLocations").getGenericType());
    }
}
