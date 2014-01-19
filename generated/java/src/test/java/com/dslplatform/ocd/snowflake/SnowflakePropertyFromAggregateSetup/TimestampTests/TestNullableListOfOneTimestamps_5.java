package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.TimestampTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneTimestamps_5;

public class TestNullableListOfOneTimestamps_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneTimestamps_5.class.getDeclaredField(
                        "nullableListOfOneTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneTimestamps_5.class.getDeclaredField(
                        "nullableListOfOneTimestamps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<org.joda.time.DateTime> nullableListOfOneTimestamps = null;
                }.getClass().getDeclaredField("nullableListOfOneTimestamps").getGenericType(),
                NullableListOfOneTimestamps_5.class.getDeclaredField("nullableListOfOneTimestamps").getGenericType());
    }
}
