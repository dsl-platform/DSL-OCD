package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableStringsWithMaxLengthOf9Value2;

public class TestNullableListOfNullableStringsWithMaxLengthOf9Value2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableStringsWithMaxLengthOf9Value2.class.getDeclaredField(
                        "nullableListOfNullableStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableStringsWithMaxLengthOf9Value2.class.getDeclaredField(
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
                NullableListOfNullableStringsWithMaxLengthOf9Value2.class.getDeclaredField("nullableListOfNullableStringsWithMaxLengthOf9").getGenericType());
    }
}
