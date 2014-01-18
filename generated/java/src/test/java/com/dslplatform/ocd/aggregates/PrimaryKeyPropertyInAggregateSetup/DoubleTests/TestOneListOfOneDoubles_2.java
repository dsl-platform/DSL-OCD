package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.DoubleTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneDoubles_2;

public class TestOneListOfOneDoubles_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneDoubles_2.class.getDeclaredField(
                        "oneListOfOneDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneDoubles_2.class.getDeclaredField(
                        "oneListOfOneDoubles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Double> oneListOfOneDoubles = null;
                }.getClass().getDeclaredField("oneListOfOneDoubles").getGenericType(),
                OneListOfOneDoubles_2.class.getDeclaredField("oneListOfOneDoubles").getGenericType());
    }
}
