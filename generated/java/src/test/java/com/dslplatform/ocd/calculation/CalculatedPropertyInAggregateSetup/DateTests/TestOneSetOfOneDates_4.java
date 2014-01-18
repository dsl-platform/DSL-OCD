package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.DateTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneDates_4;

public class TestOneSetOfOneDates_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneDates_4.class.getDeclaredField(
                        "oneSetOfOneDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneDates_4.class.getDeclaredField(
                        "oneSetOfOneDates").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<org.joda.time.LocalDate> oneSetOfOneDates = null;
                }.getClass().getDeclaredField("oneSetOfOneDates").getGenericType(),
                OneSetOfOneDates_4.class.getDeclaredField("oneSetOfOneDates").getGenericType());
    }
}
