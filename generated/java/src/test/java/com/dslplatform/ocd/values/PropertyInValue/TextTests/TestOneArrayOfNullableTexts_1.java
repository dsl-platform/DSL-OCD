package com.dslplatform.ocd.values.PropertyInValue.TextTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfNullableTexts_1;

public class TestOneArrayOfNullableTexts_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableTexts_1.class.getDeclaredField(
                        "oneArrayOfNullableTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                OneArrayOfNullableTexts_1.class.getDeclaredField(
                        "oneArrayOfNullableTexts").getType());
    }
}
