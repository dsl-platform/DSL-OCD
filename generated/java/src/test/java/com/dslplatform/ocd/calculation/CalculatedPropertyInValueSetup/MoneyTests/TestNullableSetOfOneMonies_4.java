package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.MoneyTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableSetOfOneMonies_4;

public class TestNullableSetOfOneMonies_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneMonies_4.class.getDeclaredField(
                        "nullableSetOfOneMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneMonies_4.class.getDeclaredField(
                        "nullableSetOfOneMonies").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.math.BigDecimal> nullableSetOfOneMonies = null;
                }.getClass().getDeclaredField("nullableSetOfOneMonies").getGenericType(),
                NullableSetOfOneMonies_4.class.getDeclaredField("nullableSetOfOneMonies").getGenericType());
    }
}
