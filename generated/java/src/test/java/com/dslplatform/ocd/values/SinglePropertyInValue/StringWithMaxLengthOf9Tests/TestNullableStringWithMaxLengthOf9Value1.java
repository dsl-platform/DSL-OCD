package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableStringWithMaxLengthOf9Value1;

public class TestNullableStringWithMaxLengthOf9Value1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableStringWithMaxLengthOf9Value1.class.getDeclaredField(
                        "nullableStringWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String.class,
                NullableStringWithMaxLengthOf9Value1.class.getDeclaredField(
                        "nullableStringWithMaxLengthOf9").getType());
    }
}
