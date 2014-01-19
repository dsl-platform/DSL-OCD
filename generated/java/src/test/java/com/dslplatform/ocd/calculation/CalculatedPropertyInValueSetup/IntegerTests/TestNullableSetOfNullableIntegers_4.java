package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.IntegerTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableSetOfNullableIntegers_4;

public class TestNullableSetOfNullableIntegers_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableIntegers_4.class.getDeclaredField(
                        "nullableSetOfNullableIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableIntegers_4.class.getDeclaredField(
                        "nullableSetOfNullableIntegers").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Integer> nullableSetOfNullableIntegers = null;
                }.getClass().getDeclaredField("nullableSetOfNullableIntegers").getGenericType(),
                NullableSetOfNullableIntegers_4.class.getDeclaredField("nullableSetOfNullableIntegers").getGenericType());
    }
}
