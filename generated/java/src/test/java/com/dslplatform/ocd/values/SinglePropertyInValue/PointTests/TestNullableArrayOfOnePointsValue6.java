package com.dslplatform.ocd.values.SinglePropertyInValue.PointTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOnePointsValue6;

public class TestNullableArrayOfOnePointsValue6 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOnePointsValue6.class.getDeclaredField(
                        "nullableArrayOfOnePoints").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D[].class,
                NullableArrayOfOnePointsValue6.class.getDeclaredField(
                        "nullableArrayOfOnePoints").getType());
    }
}
