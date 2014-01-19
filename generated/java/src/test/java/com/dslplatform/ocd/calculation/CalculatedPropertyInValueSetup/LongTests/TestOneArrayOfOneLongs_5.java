package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.LongTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneArrayOfOneLongs_5;

public class TestOneArrayOfOneLongs_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneLongs_5.class.getDeclaredField(
                        "oneArrayOfOneLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                long[].class,
                OneArrayOfOneLongs_5.class.getDeclaredField(
                        "oneArrayOfOneLongs").getType());
    }
}
