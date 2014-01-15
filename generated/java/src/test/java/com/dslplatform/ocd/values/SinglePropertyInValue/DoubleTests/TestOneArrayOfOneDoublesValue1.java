package com.dslplatform.ocd.values.SinglePropertyInValue.DoubleTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneDoublesValue1;

public class TestOneArrayOfOneDoublesValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneDoublesValue1.class.getDeclaredField(
                        "oneArrayOfOneDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                double[].class,
                OneArrayOfOneDoublesValue1.class.getDeclaredField(
                        "oneArrayOfOneDoubles").getType());
    }
}
