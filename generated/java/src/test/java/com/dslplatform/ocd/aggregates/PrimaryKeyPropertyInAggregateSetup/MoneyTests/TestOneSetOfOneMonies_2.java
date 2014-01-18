package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.MoneyTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneMonies_2;

public class TestOneSetOfOneMonies_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneMonies_2.class.getDeclaredField(
                        "oneSetOfOneMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneMonies_2.class.getDeclaredField(
                        "oneSetOfOneMonies").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.math.BigDecimal> oneSetOfOneMonies = null;
                }.getClass().getDeclaredField("oneSetOfOneMonies").getGenericType(),
                OneSetOfOneMonies_2.class.getDeclaredField("oneSetOfOneMonies").getGenericType());
    }
}
