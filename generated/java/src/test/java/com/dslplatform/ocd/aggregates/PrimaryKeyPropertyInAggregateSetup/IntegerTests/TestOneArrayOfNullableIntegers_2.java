package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.IntegerTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableIntegers_2;

public class TestOneArrayOfNullableIntegers_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableIntegers_2.class.getDeclaredField(
                        "oneArrayOfNullableIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Integer[].class,
                OneArrayOfNullableIntegers_2.class.getDeclaredField(
                        "oneArrayOfNullableIntegers").getType());
    }
}
