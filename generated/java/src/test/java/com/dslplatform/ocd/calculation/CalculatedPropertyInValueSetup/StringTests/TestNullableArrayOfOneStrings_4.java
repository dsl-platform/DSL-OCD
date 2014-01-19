package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.StringTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableArrayOfOneStrings_4;

public class TestNullableArrayOfOneStrings_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneStrings_4.class.getDeclaredField(
                        "nullableArrayOfOneStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                NullableArrayOfOneStrings_4.class.getDeclaredField(
                        "nullableArrayOfOneStrings").getType());
    }
}
