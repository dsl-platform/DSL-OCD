package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.ImageTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableSetOfOneImages_4;

public class TestNullableSetOfOneImages_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneImages_4.class.getDeclaredField(
                        "nullableSetOfOneImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneImages_4.class.getDeclaredField(
                        "nullableSetOfOneImages").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.image.BufferedImage> nullableSetOfOneImages = null;
                }.getClass().getDeclaredField("nullableSetOfOneImages").getGenericType(),
                NullableSetOfOneImages_4.class.getDeclaredField("nullableSetOfOneImages").getGenericType());
    }
}
