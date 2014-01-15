package com.dslplatform.ocd.values.SinglePropertyInValue.MoneyTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableMoniesValue6;

public class TestOneArrayOfNullableMoniesValue6 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableMoniesValue6.class.getDeclaredField(
                        "oneArrayOfNullableMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                OneArrayOfNullableMoniesValue6.class.getDeclaredField(
                        "oneArrayOfNullableMonies").getType());
    }
}
