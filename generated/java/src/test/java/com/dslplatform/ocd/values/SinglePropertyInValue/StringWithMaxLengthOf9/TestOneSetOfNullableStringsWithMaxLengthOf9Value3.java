package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableStringsWithMaxLengthOf9Value3;

public class TestOneSetOfNullableStringsWithMaxLengthOf9Value3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableStringsWithMaxLengthOf9Value3.class.getDeclaredField(
                        "oneSetOfNullableStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableStringsWithMaxLengthOf9Value3.class.getDeclaredField(
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
                OneSetOfNullableStringsWithMaxLengthOf9Value3.class.getDeclaredField("oneSetOfNullableStringsWithMaxLengthOf9").getGenericType());
    }
}
