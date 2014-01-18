package com.dslplatform.ocd.values.PropertyInValue.MapTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableMap_1;

public class TestNullableMap_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableMap_1.class.getDeclaredField(
                        "nullableMap").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Map.class,
                NullableMap_1.class.getDeclaredField(
                        "nullableMap").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Map<String, String> nullableMap = null;
                }.getClass().getDeclaredField("nullableMap").getGenericType(),
                NullableMap_1.class.getDeclaredField("nullableMap").getGenericType());
    }
}
