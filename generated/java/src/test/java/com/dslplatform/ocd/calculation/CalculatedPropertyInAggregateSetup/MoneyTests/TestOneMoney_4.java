package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.MoneyTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneMoney_4;

public class TestOneMoney_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneMoney_4.class.getDeclaredField(
                        "oneMoney").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal.class,
                OneMoney_4.class.getDeclaredField(
                        "oneMoney").getType());
    }
}
