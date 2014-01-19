package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.PointTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OnePoint_5;

public class TestOnePoint_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OnePoint_5.class.getDeclaredField(
                        "onePoint").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D.class,
                OnePoint_5.class.getDeclaredField(
                        "onePoint").getType());
    }
}
