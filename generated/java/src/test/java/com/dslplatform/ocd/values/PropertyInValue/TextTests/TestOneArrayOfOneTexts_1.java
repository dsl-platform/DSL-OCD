package com.dslplatform.ocd.values.PropertyInValue.TextTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfOneTexts_1;

public class TestOneArrayOfOneTexts_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneTexts_1.class.getDeclaredField(
                        "oneArrayOfOneTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                OneArrayOfOneTexts_1.class.getDeclaredField(
                        "oneArrayOfOneTexts").getType());
    }
}
