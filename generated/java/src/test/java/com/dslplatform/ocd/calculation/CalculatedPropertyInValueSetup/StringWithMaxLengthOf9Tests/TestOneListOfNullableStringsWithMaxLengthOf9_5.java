package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneListOfNullableStringsWithMaxLengthOf9_5;

public class TestOneListOfNullableStringsWithMaxLengthOf9_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableStringsWithMaxLengthOf9_5.class.getDeclaredField(
                        "oneListOfNullableStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableStringsWithMaxLengthOf9_5.class.getDeclaredField(
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
                OneListOfNullableStringsWithMaxLengthOf9_5.class.getDeclaredField("oneListOfNullableStringsWithMaxLengthOf9").getGenericType());
    }
}
