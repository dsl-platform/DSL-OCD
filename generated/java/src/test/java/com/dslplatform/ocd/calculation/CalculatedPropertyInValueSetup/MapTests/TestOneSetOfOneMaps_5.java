package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.MapTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneSetOfOneMaps_5;

public class TestOneSetOfOneMaps_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneMaps_5.class.getDeclaredField(
                        "oneSetOfOneMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneMaps_5.class.getDeclaredField(
                        "oneSetOfOneMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.util.Map<String, String>> oneSetOfOneMaps = null;
                }.getClass().getDeclaredField("oneSetOfOneMaps").getGenericType(),
                OneSetOfOneMaps_5.class.getDeclaredField("oneSetOfOneMaps").getGenericType());
    }
}
