package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.BinaryTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneBinary_5;

public class TestOneBinary_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneBinary_5.class.getDeclaredField(
                        "oneBinary").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                byte[].class,
                OneBinary_5.class.getDeclaredField(
                        "oneBinary").getType());
    }
}
