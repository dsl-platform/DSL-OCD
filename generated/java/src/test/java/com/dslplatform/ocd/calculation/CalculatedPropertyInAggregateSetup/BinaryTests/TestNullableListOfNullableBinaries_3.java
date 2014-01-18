package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.BinaryTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableBinaries_3;

public class TestNullableListOfNullableBinaries_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableBinaries_3.class.getDeclaredField(
                        "nullableListOfNullableBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableBinaries_3.class.getDeclaredField(
                        "nullableListOfNullableBinaries").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<byte[]> nullableListOfNullableBinaries = null;
                }.getClass().getDeclaredField("nullableListOfNullableBinaries").getGenericType(),
                NullableListOfNullableBinaries_3.class.getDeclaredField("nullableListOfNullableBinaries").getGenericType());
    }
}
