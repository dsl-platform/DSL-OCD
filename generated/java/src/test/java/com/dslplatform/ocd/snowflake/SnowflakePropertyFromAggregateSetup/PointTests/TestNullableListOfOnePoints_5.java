package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.PointTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOnePoints_5;

public class TestNullableListOfOnePoints_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOnePoints_5.class.getDeclaredField(
                        "nullableListOfOnePoints").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOnePoints_5.class.getDeclaredField(
                        "nullableListOfOnePoints").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.awt.geom.Point2D> nullableListOfOnePoints = null;
                }.getClass().getDeclaredField("nullableListOfOnePoints").getGenericType(),
                NullableListOfOnePoints_5.class.getDeclaredField("nullableListOfOnePoints").getGenericType());
    }
}
