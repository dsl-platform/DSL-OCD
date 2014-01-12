package com.dslplatform.ocd.values.SinglePropertyInValue.Double;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableDoublesValue5;
import org.scalatest._;

public class TestOneArrayOfNullableDoublesValue5 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableDoublesValue5.class.getDeclaredField(
                        "oneArrayOfNullableDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Double[].class,
                OneArrayOfNullableDoublesValue5.class.getDeclaredField(
                        "oneArrayOfNullableDoubles").getType());
    }
}
