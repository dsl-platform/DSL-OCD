package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableStringsWithMaxLengthOf9_4;

public class TestOneListOfNullableStringsWithMaxLengthOf9_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableStringsWithMaxLengthOf9_4.class.getDeclaredField(
                        "oneListOfNullableStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableStringsWithMaxLengthOf9_4.class.getDeclaredField(
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
                OneListOfNullableStringsWithMaxLengthOf9_4.class.getDeclaredField("oneListOfNullableStringsWithMaxLengthOf9").getGenericType());
    }
}
