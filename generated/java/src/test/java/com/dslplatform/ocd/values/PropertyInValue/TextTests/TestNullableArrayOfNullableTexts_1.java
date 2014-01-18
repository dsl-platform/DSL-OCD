package com.dslplatform.ocd.values.PropertyInValue.TextTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableArrayOfNullableTexts_1;

public class TestNullableArrayOfNullableTexts_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableTexts_1.class.getDeclaredField(
                        "nullableArrayOfNullableTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                NullableArrayOfNullableTexts_1.class.getDeclaredField(
                        "nullableArrayOfNullableTexts").getType());
    }
}
