package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.PointTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfNullablePoints_5;

public class TestOneSetOfNullablePoints_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullablePoints_5.class.getDeclaredField(
                        "oneSetOfNullablePoints").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullablePoints_5.class.getDeclaredField(
                        "oneSetOfNullablePoints").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.geom.Point2D> oneSetOfNullablePoints = null;
                }.getClass().getDeclaredField("oneSetOfNullablePoints").getGenericType(),
                OneSetOfNullablePoints_5.class.getDeclaredField("oneSetOfNullablePoints").getGenericType());
    }
}
