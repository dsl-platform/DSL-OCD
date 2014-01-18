package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.MoneyTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableMoney_3;

public class TestNullableMoney_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableMoney_3.class.getDeclaredField(
                        "nullableMoney").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal.class,
                NullableMoney_3.class.getDeclaredField(
                        "nullableMoney").getType());
    }
}
