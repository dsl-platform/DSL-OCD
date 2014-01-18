package com.dslplatform.ocd.values.PropertyInValue.IntegerTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableArrayOfNullableIntegers_1;

public class TestNullableArrayOfNullableIntegers_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableIntegers_1.class.getDeclaredField(
                        "nullableArrayOfNullableIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Integer[].class,
                NullableArrayOfNullableIntegers_1.class.getDeclaredField(
                        "nullableArrayOfNullableIntegers").getType());
    }
}
