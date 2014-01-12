package com.dslplatform.ocd.values.SinglePropertyInValue.Integer;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableIntegersValue9;
import org.scalatest._;

public class TestOneArrayOfNullableIntegersValue9 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableIntegersValue9.class.getDeclaredField(
                        "oneArrayOfNullableIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Integer[].class,
                OneArrayOfNullableIntegersValue9.class.getDeclaredField(
                        "oneArrayOfNullableIntegers").getType());
    }
}
