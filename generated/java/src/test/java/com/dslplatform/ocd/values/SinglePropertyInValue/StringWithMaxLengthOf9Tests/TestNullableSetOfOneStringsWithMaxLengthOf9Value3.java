package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9Tests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneStringsWithMaxLengthOf9Value3;

public class TestNullableSetOfOneStringsWithMaxLengthOf9Value3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneStringsWithMaxLengthOf9Value3.class.getDeclaredField(
                        "nullableSetOfOneStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneStringsWithMaxLengthOf9Value3.class.getDeclaredField(
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
                NullableSetOfOneStringsWithMaxLengthOf9Value3.class.getDeclaredField("nullableSetOfOneStringsWithMaxLengthOf9").getGenericType());
    }
}
