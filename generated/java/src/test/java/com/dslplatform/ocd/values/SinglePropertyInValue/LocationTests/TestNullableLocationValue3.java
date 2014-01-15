package com.dslplatform.ocd.values.SinglePropertyInValue.LocationTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableLocationValue3;

public class TestNullableLocationValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableLocationValue3.class.getDeclaredField(
                        "nullableLocation").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D.class,
                NullableLocationValue3.class.getDeclaredField(
                        "nullableLocation").getType());
    }
}
