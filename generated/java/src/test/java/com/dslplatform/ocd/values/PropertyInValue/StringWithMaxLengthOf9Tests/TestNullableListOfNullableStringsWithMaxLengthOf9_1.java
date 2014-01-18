package com.dslplatform.ocd.values.PropertyInValue.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.values.PropertyInValue.NullableListOfNullableStringsWithMaxLengthOf9_1;

public class TestNullableListOfNullableStringsWithMaxLengthOf9_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableStringsWithMaxLengthOf9_1.class.getDeclaredField(
                        "nullableListOfNullableStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableStringsWithMaxLengthOf9_1.class.getDeclaredField(
                        "nullableListOfNullableStringsWithMaxLengthOf9").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<String> nullableListOfNullableStringsWithMaxLengthOf9 = null;
                }.getClass().getDeclaredField("nullableListOfNullableStringsWithMaxLengthOf9").getGenericType(),
                NullableListOfNullableStringsWithMaxLengthOf9_1.class.getDeclaredField("nullableListOfNullableStringsWithMaxLengthOf9").getGenericType());
    }
}
