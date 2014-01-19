package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.BinaryTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneArrayOfNullableBinaries_5;

public class TestOneArrayOfNullableBinaries_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableBinaries_5.class.getDeclaredField(
                        "oneArrayOfNullableBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                byte[][].class,
                OneArrayOfNullableBinaries_5.class.getDeclaredField(
                        "oneArrayOfNullableBinaries").getType());
    }
}
