package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableDecimalsValue1;

public class TestNullableSetOfNullableDecimalsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableDecimalsValue1.class.getDeclaredField(
                        "nullableSetOfNullableDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableDecimalsValue1.class.getDeclaredField(
                        "nullableSetOfNullableDecimals").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.math.BigDecimal> nullableSetOfNullableDecimals = null;
                }.getClass().getDeclaredField("nullableSetOfNullableDecimals").getGenericType(),
                NullableSetOfNullableDecimalsValue1.class.getDeclaredField("nullableSetOfNullableDecimals").getGenericType());
    }
}
