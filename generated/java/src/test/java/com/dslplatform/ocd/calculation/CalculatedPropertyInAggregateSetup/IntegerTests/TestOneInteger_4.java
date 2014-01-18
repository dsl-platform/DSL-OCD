package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.IntegerTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneInteger_4;

public class TestOneInteger_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneInteger_4.class.getDeclaredField(
                        "oneInteger").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                int.class,
                OneInteger_4.class.getDeclaredField(
                        "oneInteger").getType());
    }
}
