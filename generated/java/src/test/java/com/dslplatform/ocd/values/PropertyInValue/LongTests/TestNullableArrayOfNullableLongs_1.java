package com.dslplatform.ocd.values.PropertyInValue.LongTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableArrayOfNullableLongs_1;

public class TestNullableArrayOfNullableLongs_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableLongs_1.class.getDeclaredField(
                        "nullableArrayOfNullableLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Long[].class,
                NullableArrayOfNullableLongs_1.class.getDeclaredField(
                        "nullableArrayOfNullableLongs").getType());
    }
}
