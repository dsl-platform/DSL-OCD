package com.dslplatform.ocd.values.PropertyInValue.ImageTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableArrayOfNullableImages_1;

public class TestNullableArrayOfNullableImages_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableImages_1.class.getDeclaredField(
                        "nullableArrayOfNullableImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.image.BufferedImage[].class,
                NullableArrayOfNullableImages_1.class.getDeclaredField(
                        "nullableArrayOfNullableImages").getType());
    }
}
