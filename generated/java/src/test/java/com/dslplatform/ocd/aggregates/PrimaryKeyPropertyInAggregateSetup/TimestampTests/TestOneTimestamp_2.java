package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.TimestampTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneTimestamp_2;

public class TestOneTimestamp_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneTimestamp_2.class.getDeclaredField(
                        "oneTimestamp").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.DateTime.class,
                OneTimestamp_2.class.getDeclaredField(
                        "oneTimestamp").getType());
    }
}
