package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableStringsWithMaxLengthOf9_3;

public class TestNullableArrayOfNullableStringsWithMaxLengthOf9_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableStringsWithMaxLengthOf9_3.class.getDeclaredField(
                        "nullableArrayOfNullableStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                NullableArrayOfNullableStringsWithMaxLengthOf9_3.class.getDeclaredField(
                        "nullableArrayOfNullableStringsWithMaxLengthOf9").getType());
    }
}
