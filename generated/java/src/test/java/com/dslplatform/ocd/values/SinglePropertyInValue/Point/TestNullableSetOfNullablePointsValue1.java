package com.dslplatform.ocd.values.SinglePropertyInValue.Point;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullablePointsValue1;
import org.scalatest._;

public class TestNullableSetOfNullablePointsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullablePointsValue1.class.getDeclaredField(
                        "nullableSetOfNullablePoints").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullablePointsValue1.class.getDeclaredField(
                        "nullableSetOfNullablePoints").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.geom.Point2D> nullableSetOfNullablePoints = null;
                }.getClass().getDeclaredField("nullableSetOfNullablePoints").getGenericType(),
                NullableSetOfNullablePointsValue1.class.getDeclaredField("nullableSetOfNullablePoints").getGenericType());
    }
}
