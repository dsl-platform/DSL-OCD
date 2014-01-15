package com.dslplatform.ocd.values.SinglePropertyInValue.TimestampTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableTimestampValue4;

public class TestNullableTimestampValue4 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableTimestampValue4.class.getDeclaredField(
                        "nullableTimestamp").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.DateTime.class,
                NullableTimestampValue4.class.getDeclaredField(
                        "nullableTimestamp").getType());
    }
}
