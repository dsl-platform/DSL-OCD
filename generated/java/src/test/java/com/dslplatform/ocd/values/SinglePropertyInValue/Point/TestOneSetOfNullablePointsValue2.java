package com.dslplatform.ocd.values.SinglePropertyInValue.Point;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullablePointsValue2;
import org.scalatest._;

public class TestOneSetOfNullablePointsValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullablePointsValue2.class.getDeclaredField(
                        "oneSetOfNullablePoints").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullablePointsValue2.class.getDeclaredField(
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
                OneSetOfNullablePointsValue2.class.getDeclaredField("oneSetOfNullablePoints").getGenericType());
    }
}
