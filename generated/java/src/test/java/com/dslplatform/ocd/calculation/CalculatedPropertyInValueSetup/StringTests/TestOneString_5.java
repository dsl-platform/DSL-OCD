package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.StringTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneString_5;

public class TestOneString_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneString_5.class.getDeclaredField(
                        "oneString").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String.class,
                OneString_5.class.getDeclaredField(
                        "oneString").getType());
    }
}
