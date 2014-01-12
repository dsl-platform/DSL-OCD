package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneDecimalsWithScaleOf9Value5;
import org.scalatest._;

public class TestNullableArrayOfOneDecimalsWithScaleOf9Value5 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneDecimalsWithScaleOf9Value5.class.getDeclaredField(
                        "nullableArrayOfOneDecimalsWithScaleOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                NullableArrayOfOneDecimalsWithScaleOf9Value5.class.getDeclaredField(
                        "nullableArrayOfOneDecimalsWithScaleOf9").getType());
    }
}
