package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.StringTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableListOfOneStrings_4;

public class TestNullableListOfOneStrings_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneStrings_4.class.getDeclaredField(
                        "nullableListOfOneStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneStrings_4.class.getDeclaredField(
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
                NullableListOfOneStrings_4.class.getDeclaredField("nullableListOfOneStrings").getGenericType());
    }
}
