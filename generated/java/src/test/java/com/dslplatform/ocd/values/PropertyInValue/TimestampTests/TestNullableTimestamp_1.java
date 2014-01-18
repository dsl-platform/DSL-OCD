package com.dslplatform.ocd.values.PropertyInValue.TimestampTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableTimestamp_1;

public class TestNullableTimestamp_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableTimestamp_1.class.getDeclaredField(
                        "nullableTimestamp").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.DateTime.class,
                NullableTimestamp_1.class.getDeclaredField(
                        "nullableTimestamp").getType());
    }
}
