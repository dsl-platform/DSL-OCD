package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.BinaryTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneBinaries_3;

public class TestNullableSetOfOneBinaries_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneBinaries_3.class.getDeclaredField(
                        "nullableSetOfOneBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneBinaries_3.class.getDeclaredField(
                        "nullableSetOfOneBinaries").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<byte[]> nullableSetOfOneBinaries = null;
                }.getClass().getDeclaredField("nullableSetOfOneBinaries").getGenericType(),
                NullableSetOfOneBinaries_3.class.getDeclaredField("nullableSetOfOneBinaries").getGenericType());
    }
}
