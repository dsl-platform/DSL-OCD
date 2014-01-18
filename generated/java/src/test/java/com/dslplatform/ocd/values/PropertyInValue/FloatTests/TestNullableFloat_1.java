package com.dslplatform.ocd.values.PropertyInValue.FloatTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableFloat_1;

public class TestNullableFloat_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableFloat_1.class.getDeclaredField(
                        "nullableFloat").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Float.class,
                NullableFloat_1.class.getDeclaredField(
                        "nullableFloat").getType());
    }
}
