package com.dslplatform.ocd.values.SinglePropertyInValue.Integer;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneIntegersValue6;

public class TestOneSetOfOneIntegersValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneIntegersValue6.class.getDeclaredField(
                        "oneSetOfOneIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneIntegersValue6.class.getDeclaredField(
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
                OneSetOfOneIntegersValue6.class.getDeclaredField("oneSetOfOneIntegers").getGenericType());
    }
}
