package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9Tests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneDecimalsWithScaleOf9Value3;

public class TestNullableArrayOfOneDecimalsWithScaleOf9Value3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneDecimalsWithScaleOf9Value3.class.getDeclaredField(
                        "nullableArrayOfOneDecimalsWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                NullableArrayOfOneDecimalsWithScaleOf9Value3.class.getDeclaredField(
                        "nullableArrayOfOneDecimalsWithScaleOf9").getType());
    }
}
