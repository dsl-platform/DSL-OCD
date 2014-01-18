package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.MoneyTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfOneMonies_2;

public class TestOneArrayOfOneMonies_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneMonies_2.class.getDeclaredField(
                        "oneArrayOfOneMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                OneArrayOfOneMonies_2.class.getDeclaredField(
                        "oneArrayOfOneMonies").getType());
    }
}
