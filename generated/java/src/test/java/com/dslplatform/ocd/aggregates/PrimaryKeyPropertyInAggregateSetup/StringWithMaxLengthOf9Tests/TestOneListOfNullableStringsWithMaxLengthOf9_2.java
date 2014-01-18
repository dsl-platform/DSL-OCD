package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableStringsWithMaxLengthOf9_2;

public class TestOneListOfNullableStringsWithMaxLengthOf9_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableStringsWithMaxLengthOf9_2.class.getDeclaredField(
                        "oneListOfNullableStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableStringsWithMaxLengthOf9_2.class.getDeclaredField(
                        "oneListOfNullableStringsWithMaxLengthOf9").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<String> oneListOfNullableStringsWithMaxLengthOf9 = null;
                }.getClass().getDeclaredField("oneListOfNullableStringsWithMaxLengthOf9").getGenericType(),
                OneListOfNullableStringsWithMaxLengthOf9_2.class.getDeclaredField("oneListOfNullableStringsWithMaxLengthOf9").getGenericType());
    }
}
