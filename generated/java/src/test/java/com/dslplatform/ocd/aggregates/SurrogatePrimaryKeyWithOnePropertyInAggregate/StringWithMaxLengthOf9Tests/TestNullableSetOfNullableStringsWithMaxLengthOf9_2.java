package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfNullableStringsWithMaxLengthOf9_2;

public class TestNullableSetOfNullableStringsWithMaxLengthOf9_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableStringsWithMaxLengthOf9_2.class.getDeclaredField(
                        "nullableSetOfNullableStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableStringsWithMaxLengthOf9_2.class.getDeclaredField(
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
                NullableSetOfNullableStringsWithMaxLengthOf9_2.class.getDeclaredField("nullableSetOfNullableStringsWithMaxLengthOf9").getGenericType());
    }
}
