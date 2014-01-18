package com.dslplatform.ocd.values.PropertyInValue.DoubleTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfOneDoubles_1;

public class TestOneArrayOfOneDoubles_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneDoubles_1.class.getDeclaredField(
                        "oneArrayOfOneDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                double[].class,
                OneArrayOfOneDoubles_1.class.getDeclaredField(
                        "oneArrayOfOneDoubles").getType());
    }
}
