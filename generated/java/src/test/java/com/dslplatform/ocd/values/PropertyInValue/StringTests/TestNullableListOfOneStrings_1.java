package com.dslplatform.ocd.values.PropertyInValue.StringTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableListOfOneStrings_1;

public class TestNullableListOfOneStrings_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneStrings_1.class.getDeclaredField(
                        "nullableListOfOneStrings").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneStrings_1.class.getDeclaredField(
                        "nullableListOfOneStrings").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<String> nullableListOfOneStrings = null;
                }.getClass().getDeclaredField("nullableListOfOneStrings").getGenericType(),
                NullableListOfOneStrings_1.class.getDeclaredField("nullableListOfOneStrings").getGenericType());
    }
}
