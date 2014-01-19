package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.DateTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneDates_6;

public class TestOneSetOfOneDates_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneDates_6.class.getDeclaredField(
                        "oneSetOfOneDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneDates_6.class.getDeclaredField(
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
                OneSetOfOneDates_6.class.getDeclaredField("oneSetOfOneDates").getGenericType());
    }
}
