package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.MoneyTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableMonies_3;

public class TestNullableArrayOfNullableMonies_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableMonies_3.class.getDeclaredField(
                        "nullableArrayOfNullableMonies").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.math.BigDecimal[].class,
                NullableArrayOfNullableMonies_3.class.getDeclaredField(
                        "nullableArrayOfNullableMonies").getType());
    }
}
