package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.ImageTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableArrayOfNullableImages_4;

public class TestNullableArrayOfNullableImages_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableImages_4.class.getDeclaredField(
                        "nullableArrayOfNullableImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.image.BufferedImage[].class,
                NullableArrayOfNullableImages_4.class.getDeclaredField(
                        "nullableArrayOfNullableImages").getType());
    }
}
