package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.GuidTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableGuid_3;

public class TestNullableGuid_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableGuid_3.class.getDeclaredField(
                        "nullableGuid").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.UUID.class,
                NullableGuid_3.class.getDeclaredField(
                        "nullableGuid").getType());
    }
}
