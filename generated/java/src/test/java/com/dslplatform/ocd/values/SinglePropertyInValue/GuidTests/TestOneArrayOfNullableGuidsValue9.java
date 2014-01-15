package com.dslplatform.ocd.values.SinglePropertyInValue.GuidTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableGuidsValue9;

public class TestOneArrayOfNullableGuidsValue9 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableGuidsValue9.class.getDeclaredField(
                        "oneArrayOfNullableGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.UUID[].class,
                OneArrayOfNullableGuidsValue9.class.getDeclaredField(
                        "oneArrayOfNullableGuids").getType());
    }
}
