package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneDecimalsWithScaleOf9Value1;

public class TestOneSetOfOneDecimalsWithScaleOf9Value1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneDecimalsWithScaleOf9Value1.class.getDeclaredField(
                        "oneSetOfOneDecimalsWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneDecimalsWithScaleOf9Value1.class.getDeclaredField(
                        "oneSetOfOneDecimalsWithScaleOf9").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.math.BigDecimal> oneSetOfOneDecimalsWithScaleOf9 = null;
                }.getClass().getDeclaredField("oneSetOfOneDecimalsWithScaleOf9").getGenericType(),
                OneSetOfOneDecimalsWithScaleOf9Value1.class.getDeclaredField("oneSetOfOneDecimalsWithScaleOf9").getGenericType());
    }
}
