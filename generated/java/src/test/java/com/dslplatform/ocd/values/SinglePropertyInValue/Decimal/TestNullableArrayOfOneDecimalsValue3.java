package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneDecimalsValue3;
import org.scalatest._;

public class TestNullableArrayOfOneDecimalsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneDecimalsValue3.class.getDeclaredField(
                        "nullableArrayOfOneDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                NullableArrayOfOneDecimalsValue3.class.getDeclaredField(
                        "nullableArrayOfOneDecimals").getType());
    }
}
