package com.dslplatform.ocd.values.SinglePropertyInValue.PointTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullablePointsValue5;

public class TestOneArrayOfNullablePointsValue5 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullablePointsValue5.class.getDeclaredField(
                        "oneArrayOfNullablePoints").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D[].class,
                OneArrayOfNullablePointsValue5.class.getDeclaredField(
                        "oneArrayOfNullablePoints").getType());
    }
}
