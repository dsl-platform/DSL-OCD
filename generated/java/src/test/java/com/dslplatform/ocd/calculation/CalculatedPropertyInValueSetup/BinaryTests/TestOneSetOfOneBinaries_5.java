package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.BinaryTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneSetOfOneBinaries_5;

public class TestOneSetOfOneBinaries_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneBinaries_5.class.getDeclaredField(
                        "oneSetOfOneBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneBinaries_5.class.getDeclaredField(
                        "oneSetOfOneBinaries").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<byte[]> oneSetOfOneBinaries = null;
                }.getClass().getDeclaredField("oneSetOfOneBinaries").getGenericType(),
                OneSetOfOneBinaries_5.class.getDeclaredField("oneSetOfOneBinaries").getGenericType());
    }
}
