package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableStringsWithMaxLengthOf9_4;

public class TestOneSetOfNullableStringsWithMaxLengthOf9_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableStringsWithMaxLengthOf9_4.class.getDeclaredField(
                        "oneSetOfNullableStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableStringsWithMaxLengthOf9_4.class.getDeclaredField(
                        "oneSetOfNullableStringsWithMaxLengthOf9").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> oneSetOfNullableStringsWithMaxLengthOf9 = null;
                }.getClass().getDeclaredField("oneSetOfNullableStringsWithMaxLengthOf9").getGenericType(),
                OneSetOfNullableStringsWithMaxLengthOf9_4.class.getDeclaredField("oneSetOfNullableStringsWithMaxLengthOf9").getGenericType());
    }
}
