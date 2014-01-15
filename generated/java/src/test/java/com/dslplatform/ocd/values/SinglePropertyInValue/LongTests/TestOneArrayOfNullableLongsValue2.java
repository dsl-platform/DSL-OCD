package com.dslplatform.ocd.values.SinglePropertyInValue.LongTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableLongsValue2;

public class TestOneArrayOfNullableLongsValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableLongsValue2.class.getDeclaredField(
                        "oneArrayOfNullableLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Long[].class,
                OneArrayOfNullableLongsValue2.class.getDeclaredField(
                        "oneArrayOfNullableLongs").getType());
    }
}
