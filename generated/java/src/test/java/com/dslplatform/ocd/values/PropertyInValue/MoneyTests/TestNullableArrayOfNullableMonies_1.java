package com.dslplatform.ocd.values.PropertyInValue.MoneyTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableArrayOfNullableMonies_1;

public class TestNullableArrayOfNullableMonies_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableMonies_1.class.getDeclaredField(
                        "nullableArrayOfNullableMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                NullableArrayOfNullableMonies_1.class.getDeclaredField(
                        "nullableArrayOfNullableMonies").getType());
    }
}
