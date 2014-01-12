package com.dslplatform.ocd.values.SinglePropertyInValue.Money;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableMoniesValue4;
import org.scalatest._;

public class TestNullableArrayOfNullableMoniesValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableMoniesValue4.class.getDeclaredField(
                        "nullableArrayOfNullableMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                NullableArrayOfNullableMoniesValue4.class.getDeclaredField(
                        "nullableArrayOfNullableMonies").getType());
    }
}
