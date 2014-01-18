package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.BinaryTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneBinaries_2;

public class TestOneListOfOneBinaries_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneBinaries_2.class.getDeclaredField(
                        "oneListOfOneBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneBinaries_2.class.getDeclaredField(
                        "oneListOfOneBinaries").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<byte[]> oneListOfOneBinaries = null;
                }.getClass().getDeclaredField("oneListOfOneBinaries").getGenericType(),
                OneListOfOneBinaries_2.class.getDeclaredField("oneListOfOneBinaries").getGenericType());
    }
}
