package com.dslplatform.ocd.values.SinglePropertyInValue.MapTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableMapsValue1;

public class TestNullableListOfNullableMapsValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableMapsValue1.class.getDeclaredField(
                        "nullableListOfNullableMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableMapsValue1.class.getDeclaredField(
                        "nullableListOfNullableMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.util.Map<String, String>> nullableListOfNullableMaps = null;
                }.getClass().getDeclaredField("nullableListOfNullableMaps").getGenericType(),
                NullableListOfNullableMapsValue1.class.getDeclaredField("nullableListOfNullableMaps").getGenericType());
    }
}
