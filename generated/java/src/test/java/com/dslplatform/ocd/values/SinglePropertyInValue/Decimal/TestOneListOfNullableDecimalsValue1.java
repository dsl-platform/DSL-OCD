package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableDecimalsValue1;
import org.scalatest._;

public class TestOneListOfNullableDecimalsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableDecimalsValue1.class.getDeclaredField(
                        "oneListOfNullableDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableDecimalsValue1.class.getDeclaredField(
                        "oneListOfNullableDecimals").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.math.BigDecimal> oneListOfNullableDecimals = null;
                }.getClass().getDeclaredField("oneListOfNullableDecimals").getGenericType(),
                OneListOfNullableDecimalsValue1.class.getDeclaredField("oneListOfNullableDecimals").getGenericType());
    }
}
