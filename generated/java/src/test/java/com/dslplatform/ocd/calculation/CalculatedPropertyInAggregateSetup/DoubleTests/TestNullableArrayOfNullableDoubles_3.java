package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.DoubleTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableDoubles_3;

public class TestNullableArrayOfNullableDoubles_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableDoubles_3.class.getDeclaredField(
                        "nullableArrayOfNullableDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Double[].class,
                NullableArrayOfNullableDoubles_3.class.getDeclaredField(
                        "nullableArrayOfNullableDoubles").getType());
    }
}
