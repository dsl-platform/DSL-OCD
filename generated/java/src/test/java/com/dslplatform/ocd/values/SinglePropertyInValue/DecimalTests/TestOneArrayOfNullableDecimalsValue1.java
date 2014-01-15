package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableDecimalsValue1;

public class TestOneArrayOfNullableDecimalsValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableDecimalsValue1.class.getDeclaredField(
                        "oneArrayOfNullableDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                OneArrayOfNullableDecimalsValue1.class.getDeclaredField(
                        "oneArrayOfNullableDecimals").getType());
    }
}
