package com.dslplatform.ocd.values.SinglePropertyInValue.PointTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullablePointValue3;

public class TestNullablePointValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullablePointValue3.class.getDeclaredField(
                        "nullablePoint").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D.class,
                NullablePointValue3.class.getDeclaredField(
                        "nullablePoint").getType());
    }
}
