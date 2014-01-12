package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableStringsWithMaxLengthOf9Value1;
import org.scalatest._;

public class TestOneSetOfNullableStringsWithMaxLengthOf9Value1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableStringsWithMaxLengthOf9Value1.class.getDeclaredField(
                        "oneSetOfNullableStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableStringsWithMaxLengthOf9Value1.class.getDeclaredField(
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
                OneSetOfNullableStringsWithMaxLengthOf9Value1.class.getDeclaredField("oneSetOfNullableStringsWithMaxLengthOf9").getGenericType());
    }
}
