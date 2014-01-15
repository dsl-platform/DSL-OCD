package com.dslplatform.ocd.values.SinglePropertyInValue.BinaryTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneBinariesValue2;

public class TestOneArrayOfOneBinariesValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneBinariesValue2.class.getDeclaredField(
                        "oneArrayOfOneBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                byte[][].class,
                OneArrayOfOneBinariesValue2.class.getDeclaredField(
                        "oneArrayOfOneBinaries").getType());
    }
}
