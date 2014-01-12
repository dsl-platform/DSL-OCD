package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableTimestampsValue5;
import org.scalatest._;

public class TestOneSetOfNullableTimestampsValue5 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableTimestampsValue5.class.getDeclaredField(
                        "oneSetOfNullableTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableTimestampsValue5.class.getDeclaredField(
                        "oneSetOfNullableTimestamps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<org.joda.time.DateTime> oneSetOfNullableTimestamps = null;
                }.getClass().getDeclaredField("oneSetOfNullableTimestamps").getGenericType(),
                OneSetOfNullableTimestampsValue5.class.getDeclaredField("oneSetOfNullableTimestamps").getGenericType());
    }
}
