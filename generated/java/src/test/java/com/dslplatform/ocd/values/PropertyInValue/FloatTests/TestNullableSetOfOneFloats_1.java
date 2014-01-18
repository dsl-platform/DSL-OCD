package com.dslplatform.ocd.values.PropertyInValue.FloatTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableSetOfOneFloats_1;

public class TestNullableSetOfOneFloats_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneFloats_1.class.getDeclaredField(
                        "nullableSetOfOneFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneFloats_1.class.getDeclaredField(
                        "nullableSetOfOneFloats").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Float> nullableSetOfOneFloats = null;
                }.getClass().getDeclaredField("nullableSetOfOneFloats").getGenericType(),
                NullableSetOfOneFloats_1.class.getDeclaredField("nullableSetOfOneFloats").getGenericType());
    }
}
