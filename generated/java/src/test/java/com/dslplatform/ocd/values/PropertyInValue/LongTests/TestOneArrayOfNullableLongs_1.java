package com.dslplatform.ocd.values.PropertyInValue.LongTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfNullableLongs_1;

public class TestOneArrayOfNullableLongs_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableLongs_1.class.getDeclaredField(
                        "oneArrayOfNullableLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Long[].class,
                OneArrayOfNullableLongs_1.class.getDeclaredField(
                        "oneArrayOfNullableLongs").getType());
    }
}
