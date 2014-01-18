package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.DoubleTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneDoubles_3;

public class TestNullableArrayOfOneDoubles_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneDoubles_3.class.getDeclaredField(
                        "nullableArrayOfOneDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                double[].class,
                NullableArrayOfOneDoubles_3.class.getDeclaredField(
                        "nullableArrayOfOneDoubles").getType());
    }
}
