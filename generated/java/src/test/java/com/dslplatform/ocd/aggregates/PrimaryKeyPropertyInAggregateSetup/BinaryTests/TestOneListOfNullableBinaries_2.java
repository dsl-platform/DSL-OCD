package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.BinaryTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableBinaries_2;

public class TestOneListOfNullableBinaries_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableBinaries_2.class.getDeclaredField(
                        "oneListOfNullableBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableBinaries_2.class.getDeclaredField(
                        "oneListOfNullableBinaries").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<byte[]> oneListOfNullableBinaries = null;
                }.getClass().getDeclaredField("oneListOfNullableBinaries").getGenericType(),
                OneListOfNullableBinaries_2.class.getDeclaredField("oneListOfNullableBinaries").getGenericType());
    }
}
