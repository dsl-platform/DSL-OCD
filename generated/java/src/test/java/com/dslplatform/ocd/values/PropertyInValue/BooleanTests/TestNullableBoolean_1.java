package com.dslplatform.ocd.values.PropertyInValue.BooleanTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableBoolean_1;

public class TestNullableBoolean_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableBoolean_1.class.getDeclaredField(
                        "nullableBoolean").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Boolean.class,
                NullableBoolean_1.class.getDeclaredField(
                        "nullableBoolean").getType());
    }
}
