package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.FloatTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableListOfOneFloats_4;

public class TestNullableListOfOneFloats_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneFloats_4.class.getDeclaredField(
                        "nullableListOfOneFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneFloats_4.class.getDeclaredField(
                        "nullableListOfOneFloats").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Float> nullableListOfOneFloats = null;
                }.getClass().getDeclaredField("nullableListOfOneFloats").getGenericType(),
                NullableListOfOneFloats_4.class.getDeclaredField("nullableListOfOneFloats").getGenericType());
    }
}
