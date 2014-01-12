package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableDecimalsValue6;
import org.scalatest._;

public class TestNullableArrayOfNullableDecimalsValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableDecimalsValue6.class.getDeclaredField(
                        "nullableArrayOfNullableDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                NullableArrayOfNullableDecimalsValue6.class.getDeclaredField(
                        "nullableArrayOfNullableDecimals").getType());
    }
}
