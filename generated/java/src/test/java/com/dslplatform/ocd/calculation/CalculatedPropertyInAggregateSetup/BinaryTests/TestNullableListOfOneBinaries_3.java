package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.BinaryTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneBinaries_3;

public class TestNullableListOfOneBinaries_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneBinaries_3.class.getDeclaredField(
                        "nullableListOfOneBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneBinaries_3.class.getDeclaredField(
                        "nullableListOfOneBinaries").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<byte[]> nullableListOfOneBinaries = null;
                }.getClass().getDeclaredField("nullableListOfOneBinaries").getGenericType(),
                NullableListOfOneBinaries_3.class.getDeclaredField("nullableListOfOneBinaries").getGenericType());
    }
}
