package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.MapTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableMaps_2;

public class TestOneListOfNullableMaps_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableMaps_2.class.getDeclaredField(
                        "oneListOfNullableMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableMaps_2.class.getDeclaredField(
                        "oneListOfNullableMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.util.Map<String, String>> oneListOfNullableMaps = null;
                }.getClass().getDeclaredField("oneListOfNullableMaps").getGenericType(),
                OneListOfNullableMaps_2.class.getDeclaredField("oneListOfNullableMaps").getGenericType());
    }
}
