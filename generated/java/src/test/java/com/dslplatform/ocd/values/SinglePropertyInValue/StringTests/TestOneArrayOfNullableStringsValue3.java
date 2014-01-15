package com.dslplatform.ocd.values.SinglePropertyInValue.StringTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableStringsValue3;

public class TestOneArrayOfNullableStringsValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableStringsValue3.class.getDeclaredField(
                        "oneArrayOfNullableStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                OneArrayOfNullableStringsValue3.class.getDeclaredField(
                        "oneArrayOfNullableStrings").getType());
    }
}
