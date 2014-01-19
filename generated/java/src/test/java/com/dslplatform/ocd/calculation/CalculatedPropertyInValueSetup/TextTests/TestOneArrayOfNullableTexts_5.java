package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.TextTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneArrayOfNullableTexts_5;

public class TestOneArrayOfNullableTexts_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableTexts_5.class.getDeclaredField(
                        "oneArrayOfNullableTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                OneArrayOfNullableTexts_5.class.getDeclaredField(
                        "oneArrayOfNullableTexts").getType());
    }
}
