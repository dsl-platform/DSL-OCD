package com.dslplatform.ocd.values.SinglePropertyInValue.Integer;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableIntegersValue4;
import org.scalatest._;

public class TestNullableArrayOfNullableIntegersValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableIntegersValue4.class.getDeclaredField(
                        "nullableArrayOfNullableIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Integer[].class,
                NullableArrayOfNullableIntegersValue4.class.getDeclaredField(
                        "nullableArrayOfNullableIntegers").getType());
    }
}
