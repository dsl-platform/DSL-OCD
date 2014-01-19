package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.TimestampTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneArrayOfNullableTimestamps_5;

public class TestOneArrayOfNullableTimestamps_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableTimestamps_5.class.getDeclaredField(
                        "oneArrayOfNullableTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.DateTime[].class,
                OneArrayOfNullableTimestamps_5.class.getDeclaredField(
                        "oneArrayOfNullableTimestamps").getType());
    }
}
