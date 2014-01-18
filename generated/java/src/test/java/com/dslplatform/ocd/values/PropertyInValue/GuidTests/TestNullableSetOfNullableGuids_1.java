package com.dslplatform.ocd.values.PropertyInValue.GuidTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableSetOfNullableGuids_1;

public class TestNullableSetOfNullableGuids_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableGuids_1.class.getDeclaredField(
                        "nullableSetOfNullableGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableGuids_1.class.getDeclaredField(
                        "nullableSetOfNullableGuids").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.util.UUID> nullableSetOfNullableGuids = null;
                }.getClass().getDeclaredField("nullableSetOfNullableGuids").getGenericType(),
                NullableSetOfNullableGuids_1.class.getDeclaredField("nullableSetOfNullableGuids").getGenericType());
    }
}
