package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.BinaryTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneBinaries_4;

public class TestOneListOfOneBinaries_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneBinaries_4.class.getDeclaredField(
                        "oneListOfOneBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneBinaries_4.class.getDeclaredField(
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
                OneListOfOneBinaries_4.class.getDeclaredField("oneListOfOneBinaries").getGenericType());
    }
}
