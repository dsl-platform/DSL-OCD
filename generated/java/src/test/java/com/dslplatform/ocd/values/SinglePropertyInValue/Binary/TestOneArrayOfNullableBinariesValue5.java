package com.dslplatform.ocd.values.SinglePropertyInValue.Binary;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableBinariesValue5;

public class TestOneArrayOfNullableBinariesValue5 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableBinariesValue5.class.getDeclaredField(
                        "oneArrayOfNullableBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                byte[][].class,
                OneArrayOfNullableBinariesValue5.class.getDeclaredField(
                        "oneArrayOfNullableBinaries").getType());
    }
}
