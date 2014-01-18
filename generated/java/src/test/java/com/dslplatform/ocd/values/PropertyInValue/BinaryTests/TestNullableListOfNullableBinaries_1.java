package com.dslplatform.ocd.values.PropertyInValue.BinaryTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableListOfNullableBinaries_1;

public class TestNullableListOfNullableBinaries_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableBinaries_1.class.getDeclaredField(
                        "nullableListOfNullableBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableBinaries_1.class.getDeclaredField(
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
                NullableListOfNullableBinaries_1.class.getDeclaredField("nullableListOfNullableBinaries").getGenericType());
    }
}
