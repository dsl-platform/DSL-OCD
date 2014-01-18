package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.FloatTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneFloats_2;

public class TestOneListOfOneFloats_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneFloats_2.class.getDeclaredField(
                        "oneListOfOneFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneFloats_2.class.getDeclaredField(
                        "oneListOfOneFloats").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Float> oneListOfOneFloats = null;
                }.getClass().getDeclaredField("oneListOfOneFloats").getGenericType(),
                OneListOfOneFloats_2.class.getDeclaredField("oneListOfOneFloats").getGenericType());
    }
}
