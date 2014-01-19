package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.RectangleTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullableRectangles_5;

public class TestOneSetOfNullableRectangles_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableRectangles_5.class.getDeclaredField(
                        "oneSetOfNullableRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableRectangles_5.class.getDeclaredField(
                        "oneSetOfNullableRectangles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.geom.Rectangle2D> oneSetOfNullableRectangles = null;
                }.getClass().getDeclaredField("oneSetOfNullableRectangles").getGenericType(),
                OneSetOfNullableRectangles_5.class.getDeclaredField("oneSetOfNullableRectangles").getGenericType());
    }
}
