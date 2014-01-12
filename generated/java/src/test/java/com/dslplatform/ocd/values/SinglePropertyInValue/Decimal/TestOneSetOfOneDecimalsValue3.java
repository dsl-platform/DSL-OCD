package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneDecimalsValue3;
import org.scalatest._;

public class TestOneSetOfOneDecimalsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneDecimalsValue3.class.getDeclaredField(
                        "oneSetOfOneDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneDecimalsValue3.class.getDeclaredField(
                        "oneSetOfOneDecimals").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.math.BigDecimal> oneSetOfOneDecimals = null;
                }.getClass().getDeclaredField("oneSetOfOneDecimals").getGenericType(),
                OneSetOfOneDecimalsValue3.class.getDeclaredField("oneSetOfOneDecimals").getGenericType());
    }
}
