package com.dslplatform.ocd.values.PropertyInValue.FloatTests;

import com.dslplatform.ocd.values.PropertyInValue.OneListOfNullableFloats_1;

public class TestOneListOfNullableFloats_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableFloats_1.class.getDeclaredField(
                        "oneListOfNullableFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableFloats_1.class.getDeclaredField(
                        "oneListOfNullableFloats").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Float> oneListOfNullableFloats = null;
                }.getClass().getDeclaredField("oneListOfNullableFloats").getGenericType(),
                OneListOfNullableFloats_1.class.getDeclaredField("oneListOfNullableFloats").getGenericType());
    }
}
