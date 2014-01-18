package com.dslplatform.ocd.values.PropertyInValue.BooleanTests;

import com.dslplatform.ocd.values.PropertyInValue.OneBoolean_1;

public class TestOneBoolean_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneBoolean_1.class.getDeclaredField(
                        "oneBoolean").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                boolean.class,
                OneBoolean_1.class.getDeclaredField(
                        "oneBoolean").getType());
    }
}
