package com.dslplatform.ocd.values.PropertyInValue.BooleanTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfNullableBooleans_1;

public class TestOneArrayOfNullableBooleans_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableBooleans_1.class.getDeclaredField(
                        "oneArrayOfNullableBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Boolean[].class,
                OneArrayOfNullableBooleans_1.class.getDeclaredField(
                        "oneArrayOfNullableBooleans").getType());
    }
}
