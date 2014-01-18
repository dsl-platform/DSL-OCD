package com.dslplatform.ocd.values.PropertyInValue.MoneyTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableArrayOfOneMonies_1;

public class TestNullableArrayOfOneMonies_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneMonies_1.class.getDeclaredField(
                        "nullableArrayOfOneMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                NullableArrayOfOneMonies_1.class.getDeclaredField(
                        "nullableArrayOfOneMonies").getType());
    }
}
