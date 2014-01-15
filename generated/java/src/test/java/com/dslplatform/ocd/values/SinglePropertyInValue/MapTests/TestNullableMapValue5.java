package com.dslplatform.ocd.values.SinglePropertyInValue.MapTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableMapValue5;

public class TestNullableMapValue5 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableMapValue5.class.getDeclaredField(
                        "nullableMap").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Map.class,
                NullableMapValue5.class.getDeclaredField(
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
                NullableMapValue5.class.getDeclaredField("nullableMap").getGenericType());
    }
}
