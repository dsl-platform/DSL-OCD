package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.MapTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfOneMaps_2;

public class TestOneArrayOfOneMaps_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneMaps_2.class.getDeclaredField(
                        "oneArrayOfOneMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Map[].class,
                OneArrayOfOneMaps_2.class.getDeclaredField(
                        "oneArrayOfOneMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Map<String, String>[] oneArrayOfOneMaps = null;
                }.getClass().getDeclaredField("oneArrayOfOneMaps").getGenericType(),
                OneArrayOfOneMaps_2.class.getDeclaredField("oneArrayOfOneMaps").getGenericType());
    }
}
