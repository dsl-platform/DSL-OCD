package com.dslplatform.ocd.values.SinglePropertyInValue.Binary;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableBinariesValue1;

public class TestNullableSetOfNullableBinariesValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableBinariesValue1.class.getDeclaredField(
                        "nullableSetOfNullableBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableBinariesValue1.class.getDeclaredField(
                        "nullableSetOfNullableBinaries").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<byte[]> nullableSetOfNullableBinaries = null;
                }.getClass().getDeclaredField("nullableSetOfNullableBinaries").getGenericType(),
                NullableSetOfNullableBinariesValue1.class.getDeclaredField("nullableSetOfNullableBinaries").getGenericType());
    }
}
