package com.dslplatform.ocd.values.PropertyInValue.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.values.PropertyInValue.NullableSetOfNullableStringsWithMaxLengthOf9_1;

public class TestNullableSetOfNullableStringsWithMaxLengthOf9_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableStringsWithMaxLengthOf9_1.class.getDeclaredField(
                        "nullableSetOfNullableStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableStringsWithMaxLengthOf9_1.class.getDeclaredField(
                        "nullableSetOfNullableStringsWithMaxLengthOf9").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> nullableSetOfNullableStringsWithMaxLengthOf9 = null;
                }.getClass().getDeclaredField("nullableSetOfNullableStringsWithMaxLengthOf9").getGenericType(),
                NullableSetOfNullableStringsWithMaxLengthOf9_1.class.getDeclaredField("nullableSetOfNullableStringsWithMaxLengthOf9").getGenericType());
    }
}
