package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.IntegerTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableIntegers_4;

public class TestOneListOfNullableIntegers_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableIntegers_4.class.getDeclaredField(
                        "oneListOfNullableIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableIntegers_4.class.getDeclaredField(
                        "oneListOfNullableIntegers").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Integer> oneListOfNullableIntegers = null;
                }.getClass().getDeclaredField("oneListOfNullableIntegers").getGenericType(),
                OneListOfNullableIntegers_4.class.getDeclaredField("oneListOfNullableIntegers").getGenericType());
    }
}
