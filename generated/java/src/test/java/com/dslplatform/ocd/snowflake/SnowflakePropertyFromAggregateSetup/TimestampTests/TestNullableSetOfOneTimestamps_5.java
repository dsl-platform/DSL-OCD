package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.TimestampTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneTimestamps_5;

public class TestNullableSetOfOneTimestamps_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneTimestamps_5.class.getDeclaredField(
                        "nullableSetOfOneTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneTimestamps_5.class.getDeclaredField(
                        "nullableSetOfOneTimestamps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<org.joda.time.DateTime> nullableSetOfOneTimestamps = null;
                }.getClass().getDeclaredField("nullableSetOfOneTimestamps").getGenericType(),
                NullableSetOfOneTimestamps_5.class.getDeclaredField("nullableSetOfOneTimestamps").getGenericType());
    }
}
