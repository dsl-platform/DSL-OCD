package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.DateTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableDates_6;

public class TestOneListOfNullableDates_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableDates_6.class.getDeclaredField(
                        "oneListOfNullableDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableDates_6.class.getDeclaredField(
                        "oneListOfNullableDates").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<org.joda.time.LocalDate> oneListOfNullableDates = null;
                }.getClass().getDeclaredField("oneListOfNullableDates").getGenericType(),
                OneListOfNullableDates_6.class.getDeclaredField("oneListOfNullableDates").getGenericType());
    }
}
