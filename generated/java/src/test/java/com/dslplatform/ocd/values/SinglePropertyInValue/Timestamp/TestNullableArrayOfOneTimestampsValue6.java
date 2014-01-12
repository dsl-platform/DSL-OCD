package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneTimestampsValue6;
import org.scalatest._;

public class TestNullableArrayOfOneTimestampsValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneTimestampsValue6.class.getDeclaredField(
                        "nullableArrayOfOneTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.DateTime[].class,
                NullableArrayOfOneTimestampsValue6.class.getDeclaredField(
                        "nullableArrayOfOneTimestamps").getType());
    }
}
