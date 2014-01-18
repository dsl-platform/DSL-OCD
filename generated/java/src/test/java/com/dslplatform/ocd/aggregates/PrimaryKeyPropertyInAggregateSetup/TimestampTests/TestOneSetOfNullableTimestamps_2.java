package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.TimestampTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableTimestamps_2;

public class TestOneSetOfNullableTimestamps_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableTimestamps_2.class.getDeclaredField(
                        "oneSetOfNullableTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableTimestamps_2.class.getDeclaredField(
                        "oneSetOfNullableTimestamps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<org.joda.time.DateTime> oneSetOfNullableTimestamps = null;
                }.getClass().getDeclaredField("oneSetOfNullableTimestamps").getGenericType(),
                OneSetOfNullableTimestamps_2.class.getDeclaredField("oneSetOfNullableTimestamps").getGenericType());
    }
}
