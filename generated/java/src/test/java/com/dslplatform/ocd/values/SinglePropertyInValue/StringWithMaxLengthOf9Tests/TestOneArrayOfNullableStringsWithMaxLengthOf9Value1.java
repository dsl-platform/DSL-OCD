package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableStringsWithMaxLengthOf9Value1;

public class TestOneArrayOfNullableStringsWithMaxLengthOf9Value1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableStringsWithMaxLengthOf9Value1.class.getDeclaredField(
                        "oneArrayOfNullableStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                OneArrayOfNullableStringsWithMaxLengthOf9Value1.class.getDeclaredField(
                        "oneArrayOfNullableStringsWithMaxLengthOf9").getType());
    }
}
