package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.FloatTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableFloats_2;

public class TestOneListOfNullableFloats_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableFloats_2.class.getDeclaredField(
                        "oneListOfNullableFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableFloats_2.class.getDeclaredField(
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
                OneListOfNullableFloats_2.class.getDeclaredField("oneListOfNullableFloats").getGenericType());
    }
}