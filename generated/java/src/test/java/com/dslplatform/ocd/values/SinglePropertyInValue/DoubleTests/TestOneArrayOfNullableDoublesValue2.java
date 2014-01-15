package com.dslplatform.ocd.values.SinglePropertyInValue.DoubleTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableDoublesValue2;

public class TestOneArrayOfNullableDoublesValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableDoublesValue2.class.getDeclaredField(
                        "oneArrayOfNullableDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Double[].class,
                OneArrayOfNullableDoublesValue2.class.getDeclaredField(
                        "oneArrayOfNullableDoubles").getType());
    }
}
