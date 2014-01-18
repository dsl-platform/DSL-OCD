package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.GuidTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneGuids_3;

public class TestNullableSetOfOneGuids_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneGuids_3.class.getDeclaredField(
                        "nullableSetOfOneGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneGuids_3.class.getDeclaredField(
                        "nullableSetOfOneGuids").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.util.UUID> nullableSetOfOneGuids = null;
                }.getClass().getDeclaredField("nullableSetOfOneGuids").getGenericType(),
                NullableSetOfOneGuids_3.class.getDeclaredField("nullableSetOfOneGuids").getGenericType());
    }
}
