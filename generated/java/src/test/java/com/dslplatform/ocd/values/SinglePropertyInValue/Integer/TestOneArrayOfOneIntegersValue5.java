package com.dslplatform.ocd.values.SinglePropertyInValue.Integer;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneIntegersValue5;
import org.scalatest._;

public class TestOneArrayOfOneIntegersValue5 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneIntegersValue5.class.getDeclaredField(
                        "oneArrayOfOneIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                int[].class,
                OneArrayOfOneIntegersValue5.class.getDeclaredField(
                        "oneArrayOfOneIntegers").getType());
    }
}
