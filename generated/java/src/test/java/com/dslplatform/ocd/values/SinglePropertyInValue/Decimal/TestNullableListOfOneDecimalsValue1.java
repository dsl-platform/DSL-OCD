package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneDecimalsValue1;
import org.scalatest._;

public class TestNullableListOfOneDecimalsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneDecimalsValue1.class.getDeclaredField(
                        "nullableListOfOneDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneDecimalsValue1.class.getDeclaredField(
                        "nullableListOfOneDecimals").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.math.BigDecimal> nullableListOfOneDecimals = null;
                }.getClass().getDeclaredField("nullableListOfOneDecimals").getGenericType(),
                NullableListOfOneDecimalsValue1.class.getDeclaredField("nullableListOfOneDecimals").getGenericType());
    }
}
