package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.DoubleTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableListOfNullableDoubles_4;

public class TestNullableListOfNullableDoubles_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableDoubles_4.class.getDeclaredField(
                        "nullableListOfNullableDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableDoubles_4.class.getDeclaredField(
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
                NullableListOfNullableDoubles_4.class.getDeclaredField("nullableListOfNullableDoubles").getGenericType());
    }
}
