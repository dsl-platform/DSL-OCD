package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.IntegerTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableInteger_4;

public class TestNullableInteger_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableInteger_4.class.getDeclaredField(
                        "nullableInteger").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Integer.class,
                NullableInteger_4.class.getDeclaredField(
                        "nullableInteger").getType());
    }
}
