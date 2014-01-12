package com.dslplatform.ocd.values.SinglePropertyInValue.Double;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableDoublesValue2;
import org.scalatest._;

public class TestNullableArrayOfNullableDoublesValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableDoublesValue2.class.getDeclaredField(
                        "nullableArrayOfNullableDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Double[].class,
                NullableArrayOfNullableDoublesValue2.class.getDeclaredField(
                        "nullableArrayOfNullableDoubles").getType());
    }
}
