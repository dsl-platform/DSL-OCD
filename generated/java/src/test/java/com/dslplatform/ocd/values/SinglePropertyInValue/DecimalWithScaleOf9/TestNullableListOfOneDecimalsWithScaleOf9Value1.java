package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneDecimalsWithScaleOf9Value1;
import org.scalatest._;

public class TestNullableListOfOneDecimalsWithScaleOf9Value1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneDecimalsWithScaleOf9Value1.class.getDeclaredField(
                        "nullableListOfOneDecimalsWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneDecimalsWithScaleOf9Value1.class.getDeclaredField(
                        "nullableListOfOneDecimalsWithScaleOf9").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.math.BigDecimal> nullableListOfOneDecimalsWithScaleOf9 = null;
                }.getClass().getDeclaredField("nullableListOfOneDecimalsWithScaleOf9").getGenericType(),
                NullableListOfOneDecimalsWithScaleOf9Value1.class.getDeclaredField("nullableListOfOneDecimalsWithScaleOf9").getGenericType());
    }
}
