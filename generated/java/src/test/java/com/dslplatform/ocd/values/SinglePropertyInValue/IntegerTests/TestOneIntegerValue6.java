package com.dslplatform.ocd.values.SinglePropertyInValue.IntegerTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneIntegerValue6;

public class TestOneIntegerValue6 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneIntegerValue6.class.getDeclaredField(
                        "oneInteger").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                int.class,
                OneIntegerValue6.class.getDeclaredField(
                        "oneInteger").getType());
    }
}
