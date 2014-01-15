package com.dslplatform.ocd.values.SinglePropertyInValue.StringTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableStringsValue6;

public class TestNullableArrayOfNullableStringsValue6 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableStringsValue6.class.getDeclaredField(
                        "nullableArrayOfNullableStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                NullableArrayOfNullableStringsValue6.class.getDeclaredField(
                        "nullableArrayOfNullableStrings").getType());
    }
}
