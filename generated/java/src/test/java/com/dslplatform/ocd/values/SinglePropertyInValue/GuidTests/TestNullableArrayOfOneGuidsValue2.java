package com.dslplatform.ocd.values.SinglePropertyInValue.GuidTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneGuidsValue2;

public class TestNullableArrayOfOneGuidsValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneGuidsValue2.class.getDeclaredField(
                        "nullableArrayOfOneGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.UUID[].class,
                NullableArrayOfOneGuidsValue2.class.getDeclaredField(
                        "nullableArrayOfOneGuids").getType());
    }
}
