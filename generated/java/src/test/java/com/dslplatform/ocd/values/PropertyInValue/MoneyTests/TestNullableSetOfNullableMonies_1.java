package com.dslplatform.ocd.values.PropertyInValue.MoneyTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableSetOfNullableMonies_1;

public class TestNullableSetOfNullableMonies_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableMonies_1.class.getDeclaredField(
                        "nullableSetOfNullableMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableMonies_1.class.getDeclaredField(
                        "nullableSetOfNullableMonies").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.math.BigDecimal> nullableSetOfNullableMonies = null;
                }.getClass().getDeclaredField("nullableSetOfNullableMonies").getGenericType(),
                NullableSetOfNullableMonies_1.class.getDeclaredField("nullableSetOfNullableMonies").getGenericType());
    }
}
