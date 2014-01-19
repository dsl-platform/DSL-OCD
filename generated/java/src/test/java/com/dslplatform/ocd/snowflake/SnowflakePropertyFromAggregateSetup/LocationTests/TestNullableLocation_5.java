package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.LocationTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableLocation_5;

public class TestNullableLocation_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableLocation_5.class.getDeclaredField(
                        "nullableLocation").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D.class,
                NullableLocation_5.class.getDeclaredField(
                        "nullableLocation").getType());
    }
}
