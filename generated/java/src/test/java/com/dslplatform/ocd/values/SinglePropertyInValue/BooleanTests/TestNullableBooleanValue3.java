package com.dslplatform.ocd.values.SinglePropertyInValue.BooleanTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableBooleanValue3;

public class TestNullableBooleanValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableBooleanValue3.class.getDeclaredField(
                        "nullableBoolean").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Boolean.class,
                NullableBooleanValue3.class.getDeclaredField(
                        "nullableBoolean").getType());
    }
}
