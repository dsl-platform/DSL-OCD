package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.LongTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableLongs_4;

public class TestOneArrayOfNullableLongs_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableLongs_4.class.getDeclaredField(
                        "oneArrayOfNullableLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Long[].class,
                OneArrayOfNullableLongs_4.class.getDeclaredField(
                        "oneArrayOfNullableLongs").getType());
    }
}
