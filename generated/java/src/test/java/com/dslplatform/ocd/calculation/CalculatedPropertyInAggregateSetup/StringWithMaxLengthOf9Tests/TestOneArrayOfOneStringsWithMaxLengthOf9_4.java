package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneStringsWithMaxLengthOf9_4;

public class TestOneArrayOfOneStringsWithMaxLengthOf9_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneStringsWithMaxLengthOf9_4.class.getDeclaredField(
                        "oneArrayOfOneStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                OneArrayOfOneStringsWithMaxLengthOf9_4.class.getDeclaredField(
                        "oneArrayOfOneStringsWithMaxLengthOf9").getType());
    }
}
