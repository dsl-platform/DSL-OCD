package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableTimestampsValue2;

public class TestNullableListOfNullableTimestampsValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableTimestampsValue2.class.getDeclaredField(
                        "nullableListOfNullableTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableTimestampsValue2.class.getDeclaredField(
                        "nullableListOfNullableTimestamps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<org.joda.time.DateTime> nullableListOfNullableTimestamps = null;
                }.getClass().getDeclaredField("nullableListOfNullableTimestamps").getGenericType(),
                NullableListOfNullableTimestampsValue2.class.getDeclaredField("nullableListOfNullableTimestamps").getGenericType());
    }
}
