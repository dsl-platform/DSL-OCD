package com.dslplatform.ocd.values.SinglePropertyInValue.Integer;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableIntegersValue6;
import org.scalatest._;

public class TestOneSetOfNullableIntegersValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableIntegersValue6.class.getDeclaredField(
                        "oneSetOfNullableIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableIntegersValue6.class.getDeclaredField(
                        "oneSetOfNullableIntegers").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Integer> oneSetOfNullableIntegers = null;
                }.getClass().getDeclaredField("oneSetOfNullableIntegers").getGenericType(),
                OneSetOfNullableIntegersValue6.class.getDeclaredField("oneSetOfNullableIntegers").getGenericType());
    }
}
