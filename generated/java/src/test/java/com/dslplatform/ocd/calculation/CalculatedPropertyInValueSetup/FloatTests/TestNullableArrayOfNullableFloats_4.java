package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.FloatTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableArrayOfNullableFloats_4;

public class TestNullableArrayOfNullableFloats_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableFloats_4.class.getDeclaredField(
                        "nullableArrayOfNullableFloats").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Float[].class,
                NullableArrayOfNullableFloats_4.class.getDeclaredField(
                        "nullableArrayOfNullableFloats").getType());
    }
}
