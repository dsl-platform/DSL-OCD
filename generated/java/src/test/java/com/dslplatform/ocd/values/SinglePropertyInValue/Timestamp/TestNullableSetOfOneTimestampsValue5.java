package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneTimestampsValue5;
import org.scalatest._;

public class TestNullableSetOfOneTimestampsValue5 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneTimestampsValue5.class.getDeclaredField(
                        "nullableSetOfOneTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneTimestampsValue5.class.getDeclaredField(
                        "nullableSetOfOneTimestamps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<org.joda.time.DateTime> nullableSetOfOneTimestamps = null;
                }.getClass().getDeclaredField("nullableSetOfOneTimestamps").getGenericType(),
                NullableSetOfOneTimestampsValue5.class.getDeclaredField("nullableSetOfOneTimestamps").getGenericType());
    }
}
