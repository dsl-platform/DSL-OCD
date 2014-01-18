package com.dslplatform.ocd.values.PropertyInValue.StringTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableArrayOfNullableStrings_1;

public class TestNullableArrayOfNullableStrings_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableStrings_1.class.getDeclaredField(
                        "nullableArrayOfNullableStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                NullableArrayOfNullableStrings_1.class.getDeclaredField(
                        "nullableArrayOfNullableStrings").getType());
    }
}
