package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.RectangleTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableRectangle_5;

public class TestNullableRectangle_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableRectangle_5.class.getDeclaredField(
                        "nullableRectangle").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Rectangle2D.class,
                NullableRectangle_5.class.getDeclaredField(
                        "nullableRectangle").getType());
    }
}
