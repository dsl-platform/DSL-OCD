package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableStringsWithMaxLengthOf9Value2;

public class TestNullableSetOfNullableStringsWithMaxLengthOf9Value2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableStringsWithMaxLengthOf9Value2.class.getDeclaredField(
                        "nullableSetOfNullableStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableStringsWithMaxLengthOf9Value2.class.getDeclaredField(
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
                NullableSetOfNullableStringsWithMaxLengthOf9Value2.class.getDeclaredField("nullableSetOfNullableStringsWithMaxLengthOf9").getGenericType());
    }
}
