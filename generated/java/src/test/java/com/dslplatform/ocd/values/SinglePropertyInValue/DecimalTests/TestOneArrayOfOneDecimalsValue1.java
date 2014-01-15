package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneDecimalsValue1;

public class TestOneArrayOfOneDecimalsValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneDecimalsValue1.class.getDeclaredField(
                        "oneArrayOfOneDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                OneArrayOfOneDecimalsValue1.class.getDeclaredField(
                        "oneArrayOfOneDecimals").getType());
    }
}
