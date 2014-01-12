package com.dslplatform.ocd.values.SinglePropertyInValue.Integer;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableIntegersValue2;
import org.scalatest._;

public class TestNullableArrayOfNullableIntegersValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableIntegersValue2.class.getDeclaredField(
                        "nullableArrayOfNullableIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Integer[].class,
                NullableArrayOfNullableIntegersValue2.class.getDeclaredField(
                        "nullableArrayOfNullableIntegers").getType());
    }
}
