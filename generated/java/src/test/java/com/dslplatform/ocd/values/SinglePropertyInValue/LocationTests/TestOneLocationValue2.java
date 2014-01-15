package com.dslplatform.ocd.values.SinglePropertyInValue.LocationTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneLocationValue2;

public class TestOneLocationValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneLocationValue2.class.getDeclaredField(
                        "oneLocation").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D.class,
                OneLocationValue2.class.getDeclaredField(
                        "oneLocation").getType());
    }
}
