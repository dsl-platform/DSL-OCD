package com.dslplatform.ocd.values.PropertyInValue.DecimalTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableArrayOfNullableDecimals_1;

public class TestNullableArrayOfNullableDecimals_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableDecimals_1.class.getDeclaredField(
                        "nullableArrayOfNullableDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                NullableArrayOfNullableDecimals_1.class.getDeclaredField(
                        "nullableArrayOfNullableDecimals").getType());
    }
}
