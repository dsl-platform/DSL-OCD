package com.dslplatform.ocd.values.SinglePropertyInValue.Double;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableDoublesValue1;
import org.scalatest._;

public class TestOneArrayOfNullableDoublesValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableDoublesValue1.class.getDeclaredField(
                        "oneArrayOfNullableDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Double[].class,
                OneArrayOfNullableDoublesValue1.class.getDeclaredField(
                        "oneArrayOfNullableDoubles").getType());
    }
}
