package com.dslplatform.ocd.values.SinglePropertyInValue.IntegerTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableIntegersValue3;

public class TestOneSetOfNullableIntegersValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableIntegersValue3.class.getDeclaredField(
                        "oneSetOfNullableIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableIntegersValue3.class.getDeclaredField(
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
                OneSetOfNullableIntegersValue3.class.getDeclaredField("oneSetOfNullableIntegers").getGenericType());
    }
}
