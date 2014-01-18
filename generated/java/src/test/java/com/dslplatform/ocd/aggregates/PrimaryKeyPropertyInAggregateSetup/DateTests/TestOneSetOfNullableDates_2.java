package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.DateTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableDates_2;

public class TestOneSetOfNullableDates_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableDates_2.class.getDeclaredField(
                        "oneSetOfNullableDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableDates_2.class.getDeclaredField(
                        "oneSetOfNullableDates").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<org.joda.time.LocalDate> oneSetOfNullableDates = null;
                }.getClass().getDeclaredField("oneSetOfNullableDates").getGenericType(),
                OneSetOfNullableDates_2.class.getDeclaredField("oneSetOfNullableDates").getGenericType());
    }
}
