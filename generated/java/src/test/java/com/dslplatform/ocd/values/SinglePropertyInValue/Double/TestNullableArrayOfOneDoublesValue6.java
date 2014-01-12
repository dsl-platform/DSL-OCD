package com.dslplatform.ocd.values.SinglePropertyInValue.Double;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneDoublesValue6;
import org.scalatest._;

public class TestNullableArrayOfOneDoublesValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneDoublesValue6.class.getDeclaredField(
                        "nullableArrayOfOneDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                double[].class,
                NullableArrayOfOneDoublesValue6.class.getDeclaredField(
                        "nullableArrayOfOneDoubles").getType());
    }
}
