package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.MoneyTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableMonies_2;

public class TestOneSetOfNullableMonies_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableMonies_2.class.getDeclaredField(
                        "oneSetOfNullableMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableMonies_2.class.getDeclaredField(
                        "oneSetOfNullableMonies").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.math.BigDecimal> oneSetOfNullableMonies = null;
                }.getClass().getDeclaredField("oneSetOfNullableMonies").getGenericType(),
                OneSetOfNullableMonies_2.class.getDeclaredField("oneSetOfNullableMonies").getGenericType());
    }
}
