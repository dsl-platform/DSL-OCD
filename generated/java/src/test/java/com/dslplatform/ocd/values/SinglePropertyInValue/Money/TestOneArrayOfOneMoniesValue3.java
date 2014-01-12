package com.dslplatform.ocd.values.SinglePropertyInValue.Money;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneMoniesValue3;
import org.scalatest._;

public class TestOneArrayOfOneMoniesValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneMoniesValue3.class.getDeclaredField(
                        "oneArrayOfOneMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                OneArrayOfOneMoniesValue3.class.getDeclaredField(
                        "oneArrayOfOneMonies").getType());
    }
}
