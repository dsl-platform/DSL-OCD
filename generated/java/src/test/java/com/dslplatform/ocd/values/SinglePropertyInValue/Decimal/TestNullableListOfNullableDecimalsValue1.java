package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableDecimalsValue1;
import org.scalatest._;

public class TestNullableListOfNullableDecimalsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableDecimalsValue1.class.getDeclaredField(
                        "nullableListOfNullableDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableDecimalsValue1.class.getDeclaredField(
                        "nullableListOfNullableDecimals").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.math.BigDecimal> nullableListOfNullableDecimals = null;
                }.getClass().getDeclaredField("nullableListOfNullableDecimals").getGenericType(),
                NullableListOfNullableDecimalsValue1.class.getDeclaredField("nullableListOfNullableDecimals").getGenericType());
    }
}
