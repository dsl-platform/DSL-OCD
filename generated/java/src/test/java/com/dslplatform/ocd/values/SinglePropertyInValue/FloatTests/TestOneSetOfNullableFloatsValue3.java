package com.dslplatform.ocd.values.SinglePropertyInValue.FloatTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableFloatsValue3;

public class TestOneSetOfNullableFloatsValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableFloatsValue3.class.getDeclaredField(
                        "oneSetOfNullableFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableFloatsValue3.class.getDeclaredField(
                        "oneSetOfNullableFloats").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Float> oneSetOfNullableFloats = null;
                }.getClass().getDeclaredField("oneSetOfNullableFloats").getGenericType(),
                OneSetOfNullableFloatsValue3.class.getDeclaredField("oneSetOfNullableFloats").getGenericType());
    }
}
