package com.dslplatform.ocd.values.PropertyInValue.TimestampTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfNullableTimestamps_1;

public class TestOneArrayOfNullableTimestamps_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableTimestamps_1.class.getDeclaredField(
                        "oneArrayOfNullableTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.DateTime[].class,
                OneArrayOfNullableTimestamps_1.class.getDeclaredField(
                        "oneArrayOfNullableTimestamps").getType());
    }
}
