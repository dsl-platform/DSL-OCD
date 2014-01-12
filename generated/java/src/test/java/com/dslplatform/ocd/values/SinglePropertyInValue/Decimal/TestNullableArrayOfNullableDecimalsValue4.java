package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableDecimalsValue4;
import org.scalatest._;

public class TestNullableArrayOfNullableDecimalsValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableDecimalsValue4.class.getDeclaredField(
                        "nullableArrayOfNullableDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                NullableArrayOfNullableDecimalsValue4.class.getDeclaredField(
                        "nullableArrayOfNullableDecimals").getType());
    }
}
