package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.LongTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableLongs_4;

public class TestOneListOfNullableLongs_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableLongs_4.class.getDeclaredField(
                        "oneListOfNullableLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableLongs_4.class.getDeclaredField(
                        "oneListOfNullableLongs").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Long> oneListOfNullableLongs = null;
                }.getClass().getDeclaredField("oneListOfNullableLongs").getGenericType(),
                OneListOfNullableLongs_4.class.getDeclaredField("oneListOfNullableLongs").getGenericType());
    }
}
