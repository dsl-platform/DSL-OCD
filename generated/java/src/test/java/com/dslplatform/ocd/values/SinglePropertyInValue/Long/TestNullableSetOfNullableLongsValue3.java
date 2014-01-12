package com.dslplatform.ocd.values.SinglePropertyInValue.Long;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableLongsValue3;

public class TestNullableSetOfNullableLongsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableLongsValue3.class.getDeclaredField(
                        "nullableSetOfNullableLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableLongsValue3.class.getDeclaredField(
                        "nullableSetOfNullableLongs").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Long> nullableSetOfNullableLongs = null;
                }.getClass().getDeclaredField("nullableSetOfNullableLongs").getGenericType(),
                NullableSetOfNullableLongsValue3.class.getDeclaredField("nullableSetOfNullableLongs").getGenericType());
    }
}
