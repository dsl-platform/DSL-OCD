package com.dslplatform.ocd.values.SinglePropertyInValue.TextTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableTextValue2;

public class TestNullableTextValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableTextValue2.class.getDeclaredField(
                        "nullableText").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String.class,
                NullableTextValue2.class.getDeclaredField(
                        "nullableText").getType());
    }
}
