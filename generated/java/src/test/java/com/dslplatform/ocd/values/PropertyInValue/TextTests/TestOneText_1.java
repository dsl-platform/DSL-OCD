package com.dslplatform.ocd.values.PropertyInValue.TextTests;

import com.dslplatform.ocd.values.PropertyInValue.OneText_1;

public class TestOneText_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneText_1.class.getDeclaredField(
                        "oneText").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String.class,
                OneText_1.class.getDeclaredField(
                        "oneText").getType());
    }
}
