package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.TimestampTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableTimestamps_2;

public class TestOneArrayOfNullableTimestamps_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableTimestamps_2.class.getDeclaredField(
                        "oneArrayOfNullableTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.DateTime[].class,
                OneArrayOfNullableTimestamps_2.class.getDeclaredField(
                        "oneArrayOfNullableTimestamps").getType());
    }
}
