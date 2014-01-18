package com.dslplatform.ocd.values.PropertyInValue.IntegerTests;

import com.dslplatform.ocd.values.PropertyInValue.OneSetOfNullableIntegers_1;

public class TestOneSetOfNullableIntegers_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableIntegers_1.class.getDeclaredField(
                        "oneSetOfNullableIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableIntegers_1.class.getDeclaredField(
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
                OneSetOfNullableIntegers_1.class.getDeclaredField("oneSetOfNullableIntegers").getGenericType());
    }
}
