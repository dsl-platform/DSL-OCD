package com.dslplatform.ocd.values.PropertyInValue.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.values.PropertyInValue.NullableListOfOneStringsWithMaxLengthOf9_1;

public class TestNullableListOfOneStringsWithMaxLengthOf9_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneStringsWithMaxLengthOf9_1.class.getDeclaredField(
                        "nullableListOfOneStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneStringsWithMaxLengthOf9_1.class.getDeclaredField(
                        "nullableListOfOneStringsWithMaxLengthOf9").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<String> nullableListOfOneStringsWithMaxLengthOf9 = null;
                }.getClass().getDeclaredField("nullableListOfOneStringsWithMaxLengthOf9").getGenericType(),
                NullableListOfOneStringsWithMaxLengthOf9_1.class.getDeclaredField("nullableListOfOneStringsWithMaxLengthOf9").getGenericType());
    }
}
