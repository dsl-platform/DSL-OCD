package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.FloatTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableSetOfNullableFloats_4;

public class TestNullableSetOfNullableFloats_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableFloats_4.class.getDeclaredField(
                        "nullableSetOfNullableFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableFloats_4.class.getDeclaredField(
                        "nullableSetOfNullableFloats").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Float> nullableSetOfNullableFloats = null;
                }.getClass().getDeclaredField("nullableSetOfNullableFloats").getGenericType(),
                NullableSetOfNullableFloats_4.class.getDeclaredField("nullableSetOfNullableFloats").getGenericType());
    }
}
