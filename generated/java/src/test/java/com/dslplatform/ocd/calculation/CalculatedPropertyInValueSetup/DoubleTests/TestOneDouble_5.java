package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.DoubleTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneDouble_5;

public class TestOneDouble_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneDouble_5.class.getDeclaredField(
                        "oneDouble").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                double.class,
                OneDouble_5.class.getDeclaredField(
                        "oneDouble").getType());
    }
}
