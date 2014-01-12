package com.dslplatform.ocd.values.SinglePropertyInValue.Integer;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneIntegersValue1;
import org.scalatest._;

public class TestNullableArrayOfOneIntegersValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneIntegersValue1.class.getDeclaredField(
                        "nullableArrayOfOneIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                int[].class,
                NullableArrayOfOneIntegersValue1.class.getDeclaredField(
                        "nullableArrayOfOneIntegers").getType());
    }
}
