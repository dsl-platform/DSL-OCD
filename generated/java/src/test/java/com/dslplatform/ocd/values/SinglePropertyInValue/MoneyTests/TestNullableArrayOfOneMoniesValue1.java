package com.dslplatform.ocd.values.SinglePropertyInValue.MoneyTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneMoniesValue1;

public class TestNullableArrayOfOneMoniesValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneMoniesValue1.class.getDeclaredField(
                        "nullableArrayOfOneMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                NullableArrayOfOneMoniesValue1.class.getDeclaredField(
                        "nullableArrayOfOneMonies").getType());
    }
}
