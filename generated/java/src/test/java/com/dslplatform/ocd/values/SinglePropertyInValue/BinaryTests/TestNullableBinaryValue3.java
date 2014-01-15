package com.dslplatform.ocd.values.SinglePropertyInValue.BinaryTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableBinaryValue3;

public class TestNullableBinaryValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableBinaryValue3.class.getDeclaredField(
                        "nullableBinary").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                byte[].class,
                NullableBinaryValue3.class.getDeclaredField(
                        "nullableBinary").getType());
    }
}
