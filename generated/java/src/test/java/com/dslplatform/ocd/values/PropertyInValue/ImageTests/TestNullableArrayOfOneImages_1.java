package com.dslplatform.ocd.values.PropertyInValue.ImageTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableArrayOfOneImages_1;

public class TestNullableArrayOfOneImages_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneImages_1.class.getDeclaredField(
                        "nullableArrayOfOneImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.image.BufferedImage[].class,
                NullableArrayOfOneImages_1.class.getDeclaredField(
                        "nullableArrayOfOneImages").getType());
    }
}
