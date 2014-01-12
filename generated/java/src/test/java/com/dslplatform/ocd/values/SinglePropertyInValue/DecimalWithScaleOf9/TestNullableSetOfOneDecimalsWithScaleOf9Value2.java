package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneDecimalsWithScaleOf9Value2;

public class TestNullableSetOfOneDecimalsWithScaleOf9Value2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneDecimalsWithScaleOf9Value2.class.getDeclaredField(
                        "nullableSetOfOneDecimalsWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneDecimalsWithScaleOf9Value2.class.getDeclaredField(
                        "nullableSetOfOneDecimalsWithScaleOf9").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.math.BigDecimal> nullableSetOfOneDecimalsWithScaleOf9 = null;
                }.getClass().getDeclaredField("nullableSetOfOneDecimalsWithScaleOf9").getGenericType(),
                NullableSetOfOneDecimalsWithScaleOf9Value2.class.getDeclaredField("nullableSetOfOneDecimalsWithScaleOf9").getGenericType());
    }
}
