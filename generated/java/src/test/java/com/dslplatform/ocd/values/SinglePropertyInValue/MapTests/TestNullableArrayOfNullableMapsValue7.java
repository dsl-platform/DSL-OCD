package com.dslplatform.ocd.values.SinglePropertyInValue.MapTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableMapsValue7;

public class TestNullableArrayOfNullableMapsValue7 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableMapsValue7.class.getDeclaredField(
                        "nullableArrayOfNullableMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Map[].class,
                NullableArrayOfNullableMapsValue7.class.getDeclaredField(
                        "nullableArrayOfNullableMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Map<String, String>[] nullableArrayOfNullableMaps = null;
                }.getClass().getDeclaredField("nullableArrayOfNullableMaps").getGenericType(),
                NullableArrayOfNullableMapsValue7.class.getDeclaredField("nullableArrayOfNullableMaps").getGenericType());
    }
}
