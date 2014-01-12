package com.dslplatform.ocd.values.SinglePropertyInValue.Point;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullablePointsValue4;
import org.scalatest._;

public class TestNullableArrayOfNullablePointsValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullablePointsValue4.class.getDeclaredField(
                        "nullableArrayOfNullablePoints").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D[].class,
                NullableArrayOfNullablePointsValue4.class.getDeclaredField(
                        "nullableArrayOfNullablePoints").getType());
    }
}
