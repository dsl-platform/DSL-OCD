package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.DoubleTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableArrayOfNullableDoubles_4;

public class TestNullableArrayOfNullableDoubles_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableDoubles_4.class.getDeclaredField(
                        "nullableArrayOfNullableDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Double[].class,
                NullableArrayOfNullableDoubles_4.class.getDeclaredField(
                        "nullableArrayOfNullableDoubles").getType());
    }
}
