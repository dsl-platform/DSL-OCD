package com.dslplatform.ocd.values.SinglePropertyInValue.TextTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableTextsValue3;

public class TestNullableArrayOfNullableTextsValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableTextsValue3.class.getDeclaredField(
                        "nullableArrayOfNullableTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                NullableArrayOfNullableTextsValue3.class.getDeclaredField(
                        "nullableArrayOfNullableTexts").getType());
    }
}
