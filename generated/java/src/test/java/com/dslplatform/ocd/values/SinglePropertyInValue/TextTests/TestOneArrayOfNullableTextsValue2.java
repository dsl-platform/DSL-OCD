package com.dslplatform.ocd.values.SinglePropertyInValue.TextTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableTextsValue2;

public class TestOneArrayOfNullableTextsValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableTextsValue2.class.getDeclaredField(
                        "oneArrayOfNullableTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                OneArrayOfNullableTextsValue2.class.getDeclaredField(
                        "oneArrayOfNullableTexts").getType());
    }
}
