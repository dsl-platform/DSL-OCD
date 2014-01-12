package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableTimestampsValue2;
import org.scalatest._;

public class TestNullableArrayOfNullableTimestampsValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableTimestampsValue2.class.getDeclaredField(
                        "nullableArrayOfNullableTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.DateTime[].class,
                NullableArrayOfNullableTimestampsValue2.class.getDeclaredField(
                        "nullableArrayOfNullableTimestamps").getType());
    }
}
