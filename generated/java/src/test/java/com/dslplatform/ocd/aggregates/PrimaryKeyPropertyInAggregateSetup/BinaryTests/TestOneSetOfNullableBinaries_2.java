package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.BinaryTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableBinaries_2;

public class TestOneSetOfNullableBinaries_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableBinaries_2.class.getDeclaredField(
                        "oneSetOfNullableBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableBinaries_2.class.getDeclaredField(
                        "oneSetOfNullableBinaries").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<byte[]> oneSetOfNullableBinaries = null;
                }.getClass().getDeclaredField("oneSetOfNullableBinaries").getGenericType(),
                OneSetOfNullableBinaries_2.class.getDeclaredField("oneSetOfNullableBinaries").getGenericType());
    }
}
