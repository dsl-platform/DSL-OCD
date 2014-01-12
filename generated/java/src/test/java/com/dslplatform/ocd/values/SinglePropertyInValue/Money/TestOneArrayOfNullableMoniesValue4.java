package com.dslplatform.ocd.values.SinglePropertyInValue.Money;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableMoniesValue4;
import org.scalatest._;

public class TestOneArrayOfNullableMoniesValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableMoniesValue4.class.getDeclaredField(
                        "oneArrayOfNullableMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                OneArrayOfNullableMoniesValue4.class.getDeclaredField(
                        "oneArrayOfNullableMonies").getType());
    }
}
