package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.TimestampTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneTimestamps_6;

public class TestOneSetOfOneTimestamps_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneTimestamps_6.class.getDeclaredField(
                        "oneSetOfOneTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneTimestamps_6.class.getDeclaredField(
                        "oneSetOfOneTimestamps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<org.joda.time.DateTime> oneSetOfOneTimestamps = null;
                }.getClass().getDeclaredField("oneSetOfOneTimestamps").getGenericType(),
                OneSetOfOneTimestamps_6.class.getDeclaredField("oneSetOfOneTimestamps").getGenericType());
    }
}
