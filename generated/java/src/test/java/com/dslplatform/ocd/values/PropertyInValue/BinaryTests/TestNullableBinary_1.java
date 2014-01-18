package com.dslplatform.ocd.values.PropertyInValue.BinaryTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableBinary_1;

public class TestNullableBinary_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableBinary_1.class.getDeclaredField(
                        "nullableBinary").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                byte[].class,
                NullableBinary_1.class.getDeclaredField(
                        "nullableBinary").getType());
    }
}
