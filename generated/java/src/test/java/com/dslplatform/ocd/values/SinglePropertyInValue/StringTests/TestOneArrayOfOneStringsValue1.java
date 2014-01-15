package com.dslplatform.ocd.values.SinglePropertyInValue.StringTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneStringsValue1;

public class TestOneArrayOfOneStringsValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneStringsValue1.class.getDeclaredField(
                        "oneArrayOfOneStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                OneArrayOfOneStringsValue1.class.getDeclaredField(
                        "oneArrayOfOneStrings").getType());
    }
}
