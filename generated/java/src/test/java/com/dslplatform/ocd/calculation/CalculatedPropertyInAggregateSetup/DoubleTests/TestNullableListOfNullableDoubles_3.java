package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.DoubleTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableDoubles_3;

public class TestNullableListOfNullableDoubles_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableDoubles_3.class.getDeclaredField(
                        "nullableListOfNullableDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableDoubles_3.class.getDeclaredField(
                        "nullableListOfNullableDoubles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Double> nullableListOfNullableDoubles = null;
                }.getClass().getDeclaredField("nullableListOfNullableDoubles").getGenericType(),
                NullableListOfNullableDoubles_3.class.getDeclaredField("nullableListOfNullableDoubles").getGenericType());
    }
}
