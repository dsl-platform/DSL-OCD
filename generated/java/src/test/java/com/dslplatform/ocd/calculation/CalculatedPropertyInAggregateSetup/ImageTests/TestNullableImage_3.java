package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.ImageTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableImage_3;

public class TestNullableImage_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableImage_3.class.getDeclaredField(
                        "nullableImage").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.image.BufferedImage.class,
                NullableImage_3.class.getDeclaredField(
                        "nullableImage").getType());
    }
}
