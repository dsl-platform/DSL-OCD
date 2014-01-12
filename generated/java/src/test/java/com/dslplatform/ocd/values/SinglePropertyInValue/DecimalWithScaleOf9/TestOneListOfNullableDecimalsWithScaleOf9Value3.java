package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableDecimalsWithScaleOf9Value3;
import org.scalatest._;

public class TestOneListOfNullableDecimalsWithScaleOf9Value3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableDecimalsWithScaleOf9Value3.class.getDeclaredField(
                        "oneListOfNullableDecimalsWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableDecimalsWithScaleOf9Value3.class.getDeclaredField(
                        "oneListOfNullableDecimalsWithScaleOf9").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.math.BigDecimal> oneListOfNullableDecimalsWithScaleOf9 = null;
                }.getClass().getDeclaredField("oneListOfNullableDecimalsWithScaleOf9").getGenericType(),
                OneListOfNullableDecimalsWithScaleOf9Value3.class.getDeclaredField("oneListOfNullableDecimalsWithScaleOf9").getGenericType());
    }
}
