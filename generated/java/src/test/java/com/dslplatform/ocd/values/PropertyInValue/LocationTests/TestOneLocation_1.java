package com.dslplatform.ocd.values.PropertyInValue.LocationTests;

import com.dslplatform.ocd.values.PropertyInValue.OneLocation_1;

public class TestOneLocation_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneLocation_1.class.getDeclaredField(
                        "oneLocation").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.geom.Point2D.class,
                OneLocation_1.class.getDeclaredField(
                        "oneLocation").getType());
    }
}
