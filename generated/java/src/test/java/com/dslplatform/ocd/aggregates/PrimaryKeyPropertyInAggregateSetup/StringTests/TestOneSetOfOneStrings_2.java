package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.StringTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneStrings_2;

public class TestOneSetOfOneStrings_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneStrings_2.class.getDeclaredField(
                        "oneSetOfOneStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneStrings_2.class.getDeclaredField(
                        "oneSetOfOneStrings").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> oneSetOfOneStrings = null;
                }.getClass().getDeclaredField("oneSetOfOneStrings").getGenericType(),
                OneSetOfOneStrings_2.class.getDeclaredField("oneSetOfOneStrings").getGenericType());
    }
}
