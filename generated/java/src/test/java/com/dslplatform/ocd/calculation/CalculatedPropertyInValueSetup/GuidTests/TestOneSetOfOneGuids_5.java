package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.GuidTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneSetOfOneGuids_5;

public class TestOneSetOfOneGuids_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneGuids_5.class.getDeclaredField(
                        "oneSetOfOneGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneGuids_5.class.getDeclaredField(
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
                OneSetOfOneGuids_5.class.getDeclaredField("oneSetOfOneGuids").getGenericType());
    }
}