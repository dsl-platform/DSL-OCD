package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneStringsWithMaxLengthOf9Value1;
import org.scalatest._;

public class TestNullableSetOfOneStringsWithMaxLengthOf9Value1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneStringsWithMaxLengthOf9Value1.class.getDeclaredField(
                        "nullableSetOfOneStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneStringsWithMaxLengthOf9Value1.class.getDeclaredField(
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
                NullableSetOfOneStringsWithMaxLengthOf9Value1.class.getDeclaredField("nullableSetOfOneStringsWithMaxLengthOf9").getGenericType());
    }
}
