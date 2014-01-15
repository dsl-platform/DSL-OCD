package com.dslplatform.ocd.values.SinglePropertyInValue.GuidTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableGuidsValue5;

public class TestNullableArrayOfNullableGuidsValue5 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableGuidsValue5.class.getDeclaredField(
                        "nullableArrayOfNullableGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.UUID[].class,
                NullableArrayOfNullableGuidsValue5.class.getDeclaredField(
                        "nullableArrayOfNullableGuids").getType());
    }
}
