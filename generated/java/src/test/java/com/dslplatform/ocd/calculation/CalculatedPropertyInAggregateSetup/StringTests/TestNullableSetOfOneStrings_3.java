package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.StringTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneStrings_3;

public class TestNullableSetOfOneStrings_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneStrings_3.class.getDeclaredField(
                        "nullableSetOfOneStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneStrings_3.class.getDeclaredField(
                        "nullableSetOfOneStrings").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> nullableSetOfOneStrings = null;
                }.getClass().getDeclaredField("nullableSetOfOneStrings").getGenericType(),
                NullableSetOfOneStrings_3.class.getDeclaredField("nullableSetOfOneStrings").getGenericType());
    }
}
