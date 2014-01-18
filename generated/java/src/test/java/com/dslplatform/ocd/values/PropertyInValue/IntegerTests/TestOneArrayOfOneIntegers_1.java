package com.dslplatform.ocd.values.PropertyInValue.IntegerTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfOneIntegers_1;

public class TestOneArrayOfOneIntegers_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneIntegers_1.class.getDeclaredField(
                        "oneArrayOfOneIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                int[].class,
                OneArrayOfOneIntegers_1.class.getDeclaredField(
                        "oneArrayOfOneIntegers").getType());
    }
}
