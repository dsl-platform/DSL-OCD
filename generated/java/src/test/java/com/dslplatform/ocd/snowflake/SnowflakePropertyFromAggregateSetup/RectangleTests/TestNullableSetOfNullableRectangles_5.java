package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.RectangleTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableRectangles_5;

public class TestNullableSetOfNullableRectangles_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableRectangles_5.class.getDeclaredField(
                        "nullableSetOfNullableRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableRectangles_5.class.getDeclaredField(
                        "nullableSetOfNullableRectangles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.geom.Rectangle2D> nullableSetOfNullableRectangles = null;
                }.getClass().getDeclaredField("nullableSetOfNullableRectangles").getGenericType(),
                NullableSetOfNullableRectangles_5.class.getDeclaredField("nullableSetOfNullableRectangles").getGenericType());
    }
}
