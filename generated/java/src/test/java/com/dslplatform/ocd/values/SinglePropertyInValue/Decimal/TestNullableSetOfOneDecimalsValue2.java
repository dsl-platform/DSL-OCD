package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneDecimalsValue2;
import org.scalatest._;

public class TestNullableSetOfOneDecimalsValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneDecimalsValue2.class.getDeclaredField(
                        "nullableSetOfOneDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneDecimalsValue2.class.getDeclaredField(
                        "nullableSetOfOneDecimals").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.math.BigDecimal> nullableSetOfOneDecimals = null;
                }.getClass().getDeclaredField("nullableSetOfOneDecimals").getGenericType(),
                NullableSetOfOneDecimalsValue2.class.getDeclaredField("nullableSetOfOneDecimals").getGenericType());
    }
}
