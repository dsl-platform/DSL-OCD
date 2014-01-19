package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.RectangleTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneRectangles_5;

public class TestOneSetOfOneRectangles_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneRectangles_5.class.getDeclaredField(
                        "oneSetOfOneRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneRectangles_5.class.getDeclaredField(
                        "oneSetOfOneRectangles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.geom.Rectangle2D> oneSetOfOneRectangles = null;
                }.getClass().getDeclaredField("oneSetOfOneRectangles").getGenericType(),
                OneSetOfOneRectangles_5.class.getDeclaredField("oneSetOfOneRectangles").getGenericType());
    }
}
