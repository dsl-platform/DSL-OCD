package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneStringsWithMaxLengthOf9Value3;

public class TestOneSetOfOneStringsWithMaxLengthOf9Value3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneStringsWithMaxLengthOf9Value3.class.getDeclaredField(
                        "oneSetOfOneStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneStringsWithMaxLengthOf9Value3.class.getDeclaredField(
                        "oneSetOfOneStringsWithMaxLengthOf9").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> oneSetOfOneStringsWithMaxLengthOf9 = null;
                }.getClass().getDeclaredField("oneSetOfOneStringsWithMaxLengthOf9").getGenericType(),
                OneSetOfOneStringsWithMaxLengthOf9Value3.class.getDeclaredField("oneSetOfOneStringsWithMaxLengthOf9").getGenericType());
    }
}
