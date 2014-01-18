package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.GuidTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneGuids_2;

public class TestOneSetOfOneGuids_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneGuids_2.class.getDeclaredField(
                        "oneSetOfOneGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneGuids_2.class.getDeclaredField(
                        "oneSetOfOneGuids").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.util.UUID> oneSetOfOneGuids = null;
                }.getClass().getDeclaredField("oneSetOfOneGuids").getGenericType(),
                OneSetOfOneGuids_2.class.getDeclaredField("oneSetOfOneGuids").getGenericType());
    }
}
