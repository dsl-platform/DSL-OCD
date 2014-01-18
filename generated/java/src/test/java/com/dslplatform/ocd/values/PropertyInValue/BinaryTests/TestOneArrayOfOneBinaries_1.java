package com.dslplatform.ocd.values.PropertyInValue.BinaryTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfOneBinaries_1;

public class TestOneArrayOfOneBinaries_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneBinaries_1.class.getDeclaredField(
                        "oneArrayOfOneBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                byte[][].class,
                OneArrayOfOneBinaries_1.class.getDeclaredField(
                        "oneArrayOfOneBinaries").getType());
    }
}
