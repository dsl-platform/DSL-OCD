package com.dslplatform.ocd.values.PropertyInValue.BinaryTests;

import com.dslplatform.ocd.values.PropertyInValue.OneListOfOneBinaries_1;

public class TestOneListOfOneBinaries_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneBinaries_1.class.getDeclaredField(
                        "oneListOfOneBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneBinaries_1.class.getDeclaredField(
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
                OneListOfOneBinaries_1.class.getDeclaredField("oneListOfOneBinaries").getGenericType());
    }
}
