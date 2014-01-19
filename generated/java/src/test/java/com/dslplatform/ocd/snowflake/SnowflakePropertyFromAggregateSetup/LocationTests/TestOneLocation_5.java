package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.LocationTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneLocation_5;

public class TestOneLocation_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneLocation_5.class.getDeclaredField(
                        "oneLocation").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D.class,
                OneLocation_5.class.getDeclaredField(
                        "oneLocation").getType());
    }
}
