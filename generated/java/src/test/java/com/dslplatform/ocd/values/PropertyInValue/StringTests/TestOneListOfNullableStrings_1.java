package com.dslplatform.ocd.values.PropertyInValue.StringTests;

import com.dslplatform.ocd.values.PropertyInValue.OneListOfNullableStrings_1;

public class TestOneListOfNullableStrings_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableStrings_1.class.getDeclaredField(
                        "oneListOfNullableStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableStrings_1.class.getDeclaredField(
                        "oneListOfNullableStrings").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<String> oneListOfNullableStrings = null;
                }.getClass().getDeclaredField("oneListOfNullableStrings").getGenericType(),
                OneListOfNullableStrings_1.class.getDeclaredField("oneListOfNullableStrings").getGenericType());
    }
}
