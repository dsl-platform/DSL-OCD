package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.TimestampTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableArrayOfNullableTimestamps_4;

public class TestNullableArrayOfNullableTimestamps_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableTimestamps_4.class.getDeclaredField(
                        "nullableArrayOfNullableTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.DateTime[].class,
                NullableArrayOfNullableTimestamps_4.class.getDeclaredField(
                        "nullableArrayOfNullableTimestamps").getType());
    }
}
