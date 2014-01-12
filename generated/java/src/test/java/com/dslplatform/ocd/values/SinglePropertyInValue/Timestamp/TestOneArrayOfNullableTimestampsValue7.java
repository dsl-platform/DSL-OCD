package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableTimestampsValue7;
import org.scalatest._;

public class TestOneArrayOfNullableTimestampsValue7 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableTimestampsValue7.class.getDeclaredField(
                        "oneArrayOfNullableTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.DateTime[].class,
                OneArrayOfNullableTimestampsValue7.class.getDeclaredField(
                        "oneArrayOfNullableTimestamps").getType());
    }
}
