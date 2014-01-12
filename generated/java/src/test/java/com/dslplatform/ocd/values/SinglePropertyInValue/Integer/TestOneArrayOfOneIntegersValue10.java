package com.dslplatform.ocd.values.SinglePropertyInValue.Integer;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneIntegersValue10;
import org.scalatest._;

public class TestOneArrayOfOneIntegersValue10 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneIntegersValue10.class.getDeclaredField(
                        "oneArrayOfOneIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                int[].class,
                OneArrayOfOneIntegersValue10.class.getDeclaredField(
                        "oneArrayOfOneIntegers").getType());
    }
}
