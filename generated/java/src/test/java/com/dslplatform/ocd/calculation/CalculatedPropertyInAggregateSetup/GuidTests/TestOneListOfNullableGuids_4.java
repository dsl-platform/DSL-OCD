package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.GuidTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableGuids_4;

public class TestOneListOfNullableGuids_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableGuids_4.class.getDeclaredField(
                        "oneListOfNullableGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableGuids_4.class.getDeclaredField(
                        "oneListOfNullableGuids").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.util.UUID> oneListOfNullableGuids = null;
                }.getClass().getDeclaredField("oneListOfNullableGuids").getGenericType(),
                OneListOfNullableGuids_4.class.getDeclaredField("oneListOfNullableGuids").getGenericType());
    }
}
