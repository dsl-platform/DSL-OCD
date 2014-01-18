package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.DateTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfOneDates_2;

public class TestOneArrayOfOneDates_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneDates_2.class.getDeclaredField(
                        "oneArrayOfOneDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.LocalDate[].class,
                OneArrayOfOneDates_2.class.getDeclaredField(
                        "oneArrayOfOneDates").getType());
    }
}
