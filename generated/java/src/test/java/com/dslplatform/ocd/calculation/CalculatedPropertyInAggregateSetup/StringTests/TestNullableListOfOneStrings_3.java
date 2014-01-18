package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.StringTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneStrings_3;

public class TestNullableListOfOneStrings_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneStrings_3.class.getDeclaredField(
                        "nullableListOfOneStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneStrings_3.class.getDeclaredField(
                        "nullableListOfOneStrings").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<String> nullableListOfOneStrings = null;
                }.getClass().getDeclaredField("nullableListOfOneStrings").getGenericType(),
                NullableListOfOneStrings_3.class.getDeclaredField("nullableListOfOneStrings").getGenericType());
    }
}
