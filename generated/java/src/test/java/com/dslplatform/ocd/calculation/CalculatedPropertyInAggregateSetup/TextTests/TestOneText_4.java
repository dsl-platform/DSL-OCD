package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.TextTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneText_4;

public class TestOneText_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneText_4.class.getDeclaredField(
                        "oneText").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String.class,
                OneText_4.class.getDeclaredField(
                        "oneText").getType());
    }
}
