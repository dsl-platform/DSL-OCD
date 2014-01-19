package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.GuidTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneListOfOneGuids_5;

public class TestOneListOfOneGuids_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneGuids_5.class.getDeclaredField(
                        "oneListOfOneGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneGuids_5.class.getDeclaredField(
                        "oneListOfOneGuids").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.util.UUID> oneListOfOneGuids = null;
                }.getClass().getDeclaredField("oneListOfOneGuids").getGenericType(),
                OneListOfOneGuids_5.class.getDeclaredField("oneListOfOneGuids").getGenericType());
    }
}
