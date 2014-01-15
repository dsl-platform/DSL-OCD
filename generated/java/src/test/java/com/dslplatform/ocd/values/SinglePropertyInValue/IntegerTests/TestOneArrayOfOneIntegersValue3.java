package com.dslplatform.ocd.values.SinglePropertyInValue.IntegerTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneIntegersValue3;

public class TestOneArrayOfOneIntegersValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneIntegersValue3.class.getDeclaredField(
                        "oneArrayOfOneIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                int[].class,
                OneArrayOfOneIntegersValue3.class.getDeclaredField(
                        "oneArrayOfOneIntegers").getType());
    }
}
