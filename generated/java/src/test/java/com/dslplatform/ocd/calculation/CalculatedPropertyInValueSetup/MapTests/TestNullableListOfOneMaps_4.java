package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.MapTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableListOfOneMaps_4;

public class TestNullableListOfOneMaps_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneMaps_4.class.getDeclaredField(
                        "nullableListOfOneMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneMaps_4.class.getDeclaredField(
                        "nullableListOfOneMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.util.Map<String, String>> nullableListOfOneMaps = null;
                }.getClass().getDeclaredField("nullableListOfOneMaps").getGenericType(),
                NullableListOfOneMaps_4.class.getDeclaredField("nullableListOfOneMaps").getGenericType());
    }
}
