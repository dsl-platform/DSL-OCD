package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.MoneyTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneMonies_2;

public class TestOneListOfOneMonies_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneMonies_2.class.getDeclaredField(
                        "oneListOfOneMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneMonies_2.class.getDeclaredField(
                        "oneListOfOneMonies").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.math.BigDecimal> oneListOfOneMonies = null;
                }.getClass().getDeclaredField("oneListOfOneMonies").getGenericType(),
                OneListOfOneMonies_2.class.getDeclaredField("oneListOfOneMonies").getGenericType());
    }
}
