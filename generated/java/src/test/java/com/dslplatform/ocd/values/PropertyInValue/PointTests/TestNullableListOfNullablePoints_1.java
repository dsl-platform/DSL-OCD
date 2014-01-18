package com.dslplatform.ocd.values.PropertyInValue.PointTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableListOfNullablePoints_1;

public class TestNullableListOfNullablePoints_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullablePoints_1.class.getDeclaredField(
                        "nullableListOfNullablePoints").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullablePoints_1.class.getDeclaredField(
                        "nullableListOfNullablePoints").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.awt.geom.Point2D> nullableListOfNullablePoints = null;
                }.getClass().getDeclaredField("nullableListOfNullablePoints").getGenericType(),
                NullableListOfNullablePoints_1.class.getDeclaredField("nullableListOfNullablePoints").getGenericType());
    }
}
