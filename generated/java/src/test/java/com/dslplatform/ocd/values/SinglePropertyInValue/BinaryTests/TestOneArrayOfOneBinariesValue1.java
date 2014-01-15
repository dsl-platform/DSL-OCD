package com.dslplatform.ocd.values.SinglePropertyInValue.BinaryTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneBinariesValue1;

public class TestOneArrayOfOneBinariesValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneBinariesValue1.class.getDeclaredField(
                        "oneArrayOfOneBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                byte[][].class,
                OneArrayOfOneBinariesValue1.class.getDeclaredField(
                        "oneArrayOfOneBinaries").getType());
    }
}
