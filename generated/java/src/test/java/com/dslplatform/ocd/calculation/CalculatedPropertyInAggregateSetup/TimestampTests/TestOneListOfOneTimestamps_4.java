package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.TimestampTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneTimestamps_4;

public class TestOneListOfOneTimestamps_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneTimestamps_4.class.getDeclaredField(
                        "oneListOfOneTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneTimestamps_4.class.getDeclaredField(
                        "oneListOfOneTimestamps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<org.joda.time.DateTime> oneListOfOneTimestamps = null;
                }.getClass().getDeclaredField("oneListOfOneTimestamps").getGenericType(),
                OneListOfOneTimestamps_4.class.getDeclaredField("oneListOfOneTimestamps").getGenericType());
    }
}
