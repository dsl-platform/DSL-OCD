package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.MapTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableMaps_3;

public class TestNullableSetOfNullableMaps_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableMaps_3.class.getDeclaredField(
                        "nullableSetOfNullableMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableMaps_3.class.getDeclaredField(
                        "nullableSetOfNullableMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.util.Map<String, String>> nullableSetOfNullableMaps = null;
                }.getClass().getDeclaredField("nullableSetOfNullableMaps").getGenericType(),
                NullableSetOfNullableMaps_3.class.getDeclaredField("nullableSetOfNullableMaps").getGenericType());
    }
}
