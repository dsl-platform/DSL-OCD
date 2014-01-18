package com.dslplatform.ocd.values.PropertyInValue.BooleanTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableSetOfNullableBooleans_1;

public class TestNullableSetOfNullableBooleans_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableBooleans_1.class.getDeclaredField(
                        "nullableSetOfNullableBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableBooleans_1.class.getDeclaredField(
                        "nullableSetOfNullableBooleans").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Boolean> nullableSetOfNullableBooleans = null;
                }.getClass().getDeclaredField("nullableSetOfNullableBooleans").getGenericType(),
                NullableSetOfNullableBooleans_1.class.getDeclaredField("nullableSetOfNullableBooleans").getGenericType());
    }
}
