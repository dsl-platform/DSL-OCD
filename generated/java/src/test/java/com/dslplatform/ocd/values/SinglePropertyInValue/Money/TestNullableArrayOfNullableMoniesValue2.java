package com.dslplatform.ocd.values.SinglePropertyInValue.Money;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableMoniesValue2;
import org.scalatest._;

public class TestNullableArrayOfNullableMoniesValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableMoniesValue2.class.getDeclaredField(
                        "nullableArrayOfNullableMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                NullableArrayOfNullableMoniesValue2.class.getDeclaredField(
                        "nullableArrayOfNullableMonies").getType());
    }
}
