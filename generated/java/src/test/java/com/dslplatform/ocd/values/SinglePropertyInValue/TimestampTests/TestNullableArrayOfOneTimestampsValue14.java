package com.dslplatform.ocd.values.SinglePropertyInValue.TimestampTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneTimestampsValue14;

public class TestNullableArrayOfOneTimestampsValue14 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneTimestampsValue14.class.getDeclaredField(
                        "nullableArrayOfOneTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.DateTime[].class,
                NullableArrayOfOneTimestampsValue14.class.getDeclaredField(
                        "nullableArrayOfOneTimestamps").getType());
    }
}
