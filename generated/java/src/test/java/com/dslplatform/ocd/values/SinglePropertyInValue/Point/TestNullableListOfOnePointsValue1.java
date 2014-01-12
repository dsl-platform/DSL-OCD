package com.dslplatform.ocd.values.SinglePropertyInValue.Point;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOnePointsValue1;
import org.scalatest._;

public class TestNullableListOfOnePointsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOnePointsValue1.class.getDeclaredField(
                        "nullableListOfOnePoints").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOnePointsValue1.class.getDeclaredField(
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
                NullableListOfOnePointsValue1.class.getDeclaredField("nullableListOfOnePoints").getGenericType());
    }
}
