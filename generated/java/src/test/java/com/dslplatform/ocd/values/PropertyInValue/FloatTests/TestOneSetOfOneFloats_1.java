package com.dslplatform.ocd.values.PropertyInValue.FloatTests;

import com.dslplatform.ocd.values.PropertyInValue.OneSetOfOneFloats_1;

public class TestOneSetOfOneFloats_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneFloats_1.class.getDeclaredField(
                        "oneSetOfOneFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneFloats_1.class.getDeclaredField(
                        "oneSetOfOneFloats").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Float> oneSetOfOneFloats = null;
                }.getClass().getDeclaredField("oneSetOfOneFloats").getGenericType(),
                OneSetOfOneFloats_1.class.getDeclaredField("oneSetOfOneFloats").getGenericType());
    }
}
