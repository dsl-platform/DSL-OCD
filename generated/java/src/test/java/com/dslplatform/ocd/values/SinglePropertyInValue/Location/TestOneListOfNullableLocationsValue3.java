package com.dslplatform.ocd.values.SinglePropertyInValue.Location;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableLocationsValue3;
import org.scalatest._;

public class TestOneListOfNullableLocationsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableLocationsValue3.class.getDeclaredField(
                        "oneListOfNullableLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableLocationsValue3.class.getDeclaredField(
                        "oneListOfNullableLocations").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.awt.geom.Point2D> oneListOfNullableLocations = null;
                }.getClass().getDeclaredField("oneListOfNullableLocations").getGenericType(),
                OneListOfNullableLocationsValue3.class.getDeclaredField("oneListOfNullableLocations").getGenericType());
    }
}
