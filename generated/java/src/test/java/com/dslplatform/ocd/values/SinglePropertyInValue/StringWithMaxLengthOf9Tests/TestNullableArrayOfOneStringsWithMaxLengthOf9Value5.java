package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneStringsWithMaxLengthOf9Value5;

public class TestNullableArrayOfOneStringsWithMaxLengthOf9Value5 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneStringsWithMaxLengthOf9Value5.class.getDeclaredField(
                        "nullableArrayOfOneStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                NullableArrayOfOneStringsWithMaxLengthOf9Value5.class.getDeclaredField(
                        "nullableArrayOfOneStringsWithMaxLengthOf9").getType());
    }
}
