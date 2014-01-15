package com.dslplatform.ocd.values.SinglePropertyInValue.BinaryTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableBinariesValue1;

public class TestOneListOfNullableBinariesValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableBinariesValue1.class.getDeclaredField(
                        "oneListOfNullableBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableBinariesValue1.class.getDeclaredField(
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
                OneListOfNullableBinariesValue1.class.getDeclaredField("oneListOfNullableBinaries").getGenericType());
    }
}
