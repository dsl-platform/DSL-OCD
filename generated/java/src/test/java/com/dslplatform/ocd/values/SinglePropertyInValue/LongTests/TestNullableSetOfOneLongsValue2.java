package com.dslplatform.ocd.values.SinglePropertyInValue.LongTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneLongsValue2;

public class TestNullableSetOfOneLongsValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneLongsValue2.class.getDeclaredField(
                        "nullableSetOfOneLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneLongsValue2.class.getDeclaredField(
                        "nullableSetOfOneLongs").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Long> nullableSetOfOneLongs = null;
                }.getClass().getDeclaredField("nullableSetOfOneLongs").getGenericType(),
                NullableSetOfOneLongsValue2.class.getDeclaredField("nullableSetOfOneLongs").getGenericType());
    }
}
