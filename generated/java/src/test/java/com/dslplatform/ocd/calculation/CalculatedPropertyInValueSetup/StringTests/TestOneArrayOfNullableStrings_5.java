package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.StringTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneArrayOfNullableStrings_5;

public class TestOneArrayOfNullableStrings_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableStrings_5.class.getDeclaredField(
                        "oneArrayOfNullableStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                OneArrayOfNullableStrings_5.class.getDeclaredField(
                        "oneArrayOfNullableStrings").getType());
    }
}
