package com.dslplatform.ocd.values.PropertyInValue.BooleanTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableListOfOneBooleans_1;

public class TestNullableListOfOneBooleans_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneBooleans_1.class.getDeclaredField(
                        "nullableListOfOneBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneBooleans_1.class.getDeclaredField(
                        "nullableListOfOneBooleans").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Boolean> nullableListOfOneBooleans = null;
                }.getClass().getDeclaredField("nullableListOfOneBooleans").getGenericType(),
                NullableListOfOneBooleans_1.class.getDeclaredField("nullableListOfOneBooleans").getGenericType());
    }
}
