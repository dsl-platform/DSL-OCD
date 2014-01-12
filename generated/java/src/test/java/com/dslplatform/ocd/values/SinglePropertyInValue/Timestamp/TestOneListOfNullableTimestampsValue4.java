package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableTimestampsValue4;
import org.scalatest._;

public class TestOneListOfNullableTimestampsValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableTimestampsValue4.class.getDeclaredField(
                        "oneListOfNullableTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableTimestampsValue4.class.getDeclaredField(
                        "oneListOfNullableTimestamps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<org.joda.time.DateTime> oneListOfNullableTimestamps = null;
                }.getClass().getDeclaredField("oneListOfNullableTimestamps").getGenericType(),
                OneListOfNullableTimestampsValue4.class.getDeclaredField("oneListOfNullableTimestamps").getGenericType());
    }
}
