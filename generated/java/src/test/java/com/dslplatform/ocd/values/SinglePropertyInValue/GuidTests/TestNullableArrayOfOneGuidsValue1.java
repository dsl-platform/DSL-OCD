package com.dslplatform.ocd.values.SinglePropertyInValue.GuidTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneGuidsValue1;

public class TestNullableArrayOfOneGuidsValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneGuidsValue1.class.getDeclaredField(
                        "nullableArrayOfOneGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.UUID[].class,
                NullableArrayOfOneGuidsValue1.class.getDeclaredField(
                        "nullableArrayOfOneGuids").getType());
    }
}
