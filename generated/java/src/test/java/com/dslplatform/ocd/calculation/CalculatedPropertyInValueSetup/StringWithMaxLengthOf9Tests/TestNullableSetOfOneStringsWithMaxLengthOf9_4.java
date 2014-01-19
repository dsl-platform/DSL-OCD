package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableSetOfOneStringsWithMaxLengthOf9_4;

public class TestNullableSetOfOneStringsWithMaxLengthOf9_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneStringsWithMaxLengthOf9_4.class.getDeclaredField(
                        "nullableSetOfOneStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneStringsWithMaxLengthOf9_4.class.getDeclaredField(
                        "nullableSetOfOneStringsWithMaxLengthOf9").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> nullableSetOfOneStringsWithMaxLengthOf9 = null;
                }.getClass().getDeclaredField("nullableSetOfOneStringsWithMaxLengthOf9").getGenericType(),
                NullableSetOfOneStringsWithMaxLengthOf9_4.class.getDeclaredField("nullableSetOfOneStringsWithMaxLengthOf9").getGenericType());
    }
}
