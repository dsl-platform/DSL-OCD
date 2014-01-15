package com.dslplatform.ocd.values.SinglePropertyInValue.LongTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableLongValue3;

public class TestNullableLongValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableLongValue3.class.getDeclaredField(
                        "nullableLong").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Long.class,
                NullableLongValue3.class.getDeclaredField(
                        "nullableLong").getType());
    }
}
