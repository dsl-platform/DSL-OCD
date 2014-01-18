package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.GuidTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableGuids_4;

public class TestOneArrayOfNullableGuids_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableGuids_4.class.getDeclaredField(
                        "oneArrayOfNullableGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.UUID[].class,
                OneArrayOfNullableGuids_4.class.getDeclaredField(
                        "oneArrayOfNullableGuids").getType());
    }
}
