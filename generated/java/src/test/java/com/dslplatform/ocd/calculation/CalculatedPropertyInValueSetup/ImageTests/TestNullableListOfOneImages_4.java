package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.ImageTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableListOfOneImages_4;

public class TestNullableListOfOneImages_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneImages_4.class.getDeclaredField(
                        "nullableListOfOneImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneImages_4.class.getDeclaredField(
                        "nullableListOfOneImages").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.awt.image.BufferedImage> nullableListOfOneImages = null;
                }.getClass().getDeclaredField("nullableListOfOneImages").getGenericType(),
                NullableListOfOneImages_4.class.getDeclaredField("nullableListOfOneImages").getGenericType());
    }
}
