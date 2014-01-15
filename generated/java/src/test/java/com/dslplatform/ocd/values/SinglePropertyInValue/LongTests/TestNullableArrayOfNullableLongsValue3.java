package com.dslplatform.ocd.values.SinglePropertyInValue.LongTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableLongsValue3;

public class TestNullableArrayOfNullableLongsValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableLongsValue3.class.getDeclaredField(
                        "nullableArrayOfNullableLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Long[].class,
                NullableArrayOfNullableLongsValue3.class.getDeclaredField(
                        "nullableArrayOfNullableLongs").getType());
    }
}
