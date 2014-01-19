package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.DateTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableArrayOfOneDates_5;

public class TestNullableArrayOfOneDates_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneDates_5.class.getDeclaredField(
                        "nullableArrayOfOneDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.LocalDate[].class,
                NullableArrayOfOneDates_5.class.getDeclaredField(
                        "nullableArrayOfOneDates").getType());
    }
}
