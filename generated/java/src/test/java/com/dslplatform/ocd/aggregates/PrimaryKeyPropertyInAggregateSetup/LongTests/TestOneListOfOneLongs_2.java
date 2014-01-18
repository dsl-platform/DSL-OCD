package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.LongTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneLongs_2;

public class TestOneListOfOneLongs_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneLongs_2.class.getDeclaredField(
                        "oneListOfOneLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneLongs_2.class.getDeclaredField(
                        "oneListOfOneLongs").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Long> oneListOfOneLongs = null;
                }.getClass().getDeclaredField("oneListOfOneLongs").getGenericType(),
                OneListOfOneLongs_2.class.getDeclaredField("oneListOfOneLongs").getGenericType());
    }
}
