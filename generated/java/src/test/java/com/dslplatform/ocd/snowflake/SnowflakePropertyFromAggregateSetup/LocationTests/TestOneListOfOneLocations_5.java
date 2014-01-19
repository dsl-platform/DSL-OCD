package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.LocationTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneLocations_5;

public class TestOneListOfOneLocations_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneLocations_5.class.getDeclaredField(
                        "oneListOfOneLocations").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneLocations_5.class.getDeclaredField(
                        "oneListOfOneLocations").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.awt.geom.Point2D> oneListOfOneLocations = null;
                }.getClass().getDeclaredField("oneListOfOneLocations").getGenericType(),
                OneListOfOneLocations_5.class.getDeclaredField("oneListOfOneLocations").getGenericType());
    }
}
