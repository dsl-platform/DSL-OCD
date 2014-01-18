package com.dslplatform.ocd.values.PropertyInValue.LongTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfOneLongs_1;

public class TestOneArrayOfOneLongs_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneLongs_1.class.getDeclaredField(
                        "oneArrayOfOneLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                long[].class,
                OneArrayOfOneLongs_1.class.getDeclaredField(
                        "oneArrayOfOneLongs").getType());
    }
}
