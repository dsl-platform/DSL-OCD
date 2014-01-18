package com.dslplatform.ocd.values.PropertyInValue.MapTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfNullableMaps_1;

public class TestOneArrayOfNullableMaps_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableMaps_1.class.getDeclaredField(
                        "oneArrayOfNullableMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Map[].class,
                OneArrayOfNullableMaps_1.class.getDeclaredField(
                        "oneArrayOfNullableMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Map<String, String>[] oneArrayOfNullableMaps = null;
                }.getClass().getDeclaredField("oneArrayOfNullableMaps").getGenericType(),
                OneArrayOfNullableMaps_1.class.getDeclaredField("oneArrayOfNullableMaps").getGenericType());
    }
}
