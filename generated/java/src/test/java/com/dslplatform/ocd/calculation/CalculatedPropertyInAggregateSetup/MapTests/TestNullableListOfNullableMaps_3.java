package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.MapTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableMaps_3;

public class TestNullableListOfNullableMaps_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableMaps_3.class.getDeclaredField(
                        "nullableListOfNullableMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableMaps_3.class.getDeclaredField(
                        "nullableListOfNullableMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.util.Map<String, String>> nullableListOfNullableMaps = null;
                }.getClass().getDeclaredField("nullableListOfNullableMaps").getGenericType(),
                NullableListOfNullableMaps_3.class.getDeclaredField("nullableListOfNullableMaps").getGenericType());
    }
}
