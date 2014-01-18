package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.StringTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneStrings_2;

public class TestOneListOfOneStrings_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneStrings_2.class.getDeclaredField(
                        "oneListOfOneStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneStrings_2.class.getDeclaredField(
                        "oneListOfOneStrings").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<String> oneListOfOneStrings = null;
                }.getClass().getDeclaredField("oneListOfOneStrings").getGenericType(),
                OneListOfOneStrings_2.class.getDeclaredField("oneListOfOneStrings").getGenericType());
    }
}
