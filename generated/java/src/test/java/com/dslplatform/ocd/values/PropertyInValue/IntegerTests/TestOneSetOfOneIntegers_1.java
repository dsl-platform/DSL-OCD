package com.dslplatform.ocd.values.PropertyInValue.IntegerTests;

import com.dslplatform.ocd.values.PropertyInValue.OneSetOfOneIntegers_1;

public class TestOneSetOfOneIntegers_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneIntegers_1.class.getDeclaredField(
                        "oneSetOfOneIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneIntegers_1.class.getDeclaredField(
                        "oneSetOfOneIntegers").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Integer> oneSetOfOneIntegers = null;
                }.getClass().getDeclaredField("oneSetOfOneIntegers").getGenericType(),
                OneSetOfOneIntegers_1.class.getDeclaredField("oneSetOfOneIntegers").getGenericType());
    }
}
