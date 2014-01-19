package com.dslplatform.ocd.values.PropertyInValue.BooleanTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableArrayOfOneBooleans_1;

public class TestNullableArrayOfOneBooleans_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneBooleans_1.class.getDeclaredField(
                        "nullableArrayOfOneBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                boolean[].class,
                NullableArrayOfOneBooleans_1.class.getDeclaredField(
                        "nullableArrayOfOneBooleans").getType());
    }
}