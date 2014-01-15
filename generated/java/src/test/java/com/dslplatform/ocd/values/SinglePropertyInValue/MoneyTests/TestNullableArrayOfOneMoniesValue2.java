package com.dslplatform.ocd.values.SinglePropertyInValue.MoneyTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneMoniesValue2;

public class TestNullableArrayOfOneMoniesValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneMoniesValue2.class.getDeclaredField(
                        "nullableArrayOfOneMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                NullableArrayOfOneMoniesValue2.class.getDeclaredField(
                        "nullableArrayOfOneMonies").getType());
    }
}
