package com.dslplatform.ocd.values.PropertyInValue.DoubleTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableArrayOfNullableDoubles_1;

public class TestNullableArrayOfNullableDoubles_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableDoubles_1.class.getDeclaredField(
                        "nullableArrayOfNullableDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Double[].class,
                NullableArrayOfNullableDoubles_1.class.getDeclaredField(
                        "nullableArrayOfNullableDoubles").getType());
    }
}
