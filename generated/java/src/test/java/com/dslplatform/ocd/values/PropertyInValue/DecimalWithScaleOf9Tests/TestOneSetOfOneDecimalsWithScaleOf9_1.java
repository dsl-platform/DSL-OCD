package com.dslplatform.ocd.values.PropertyInValue.DecimalWithScaleOf9Tests;

import com.dslplatform.ocd.values.PropertyInValue.OneSetOfOneDecimalsWithScaleOf9_1;

public class TestOneSetOfOneDecimalsWithScaleOf9_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneDecimalsWithScaleOf9_1.class.getDeclaredField(
                        "oneSetOfOneDecimalsWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneDecimalsWithScaleOf9_1.class.getDeclaredField(
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
                OneSetOfOneDecimalsWithScaleOf9_1.class.getDeclaredField("oneSetOfOneDecimalsWithScaleOf9").getGenericType());
    }
}
