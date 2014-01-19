package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.RectangleTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneRectangles_5;

public class TestNullableArrayOfOneRectangles_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneRectangles_5.class.getDeclaredField(
                        "nullableArrayOfOneRectangles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Rectangle2D[].class,
                NullableArrayOfOneRectangles_5.class.getDeclaredField(
                        "nullableArrayOfOneRectangles").getType());
    }
}
