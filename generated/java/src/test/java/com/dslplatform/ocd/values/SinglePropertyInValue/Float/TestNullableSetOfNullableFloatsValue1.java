package com.dslplatform.ocd.values.SinglePropertyInValue.Float;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableFloatsValue1;

public class TestNullableSetOfNullableFloatsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableFloatsValue1.class.getDeclaredField(
                        "nullableSetOfNullableFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableFloatsValue1.class.getDeclaredField(
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
                NullableSetOfNullableFloatsValue1.class.getDeclaredField("nullableSetOfNullableFloats").getGenericType());
    }
}
