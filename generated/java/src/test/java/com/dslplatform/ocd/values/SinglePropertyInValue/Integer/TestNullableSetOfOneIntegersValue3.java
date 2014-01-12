package com.dslplatform.ocd.values.SinglePropertyInValue.Integer;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneIntegersValue3;

public class TestNullableSetOfOneIntegersValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneIntegersValue3.class.getDeclaredField(
                        "nullableSetOfOneIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneIntegersValue3.class.getDeclaredField(
                        "nullableSetOfOneIntegers").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Integer> nullableSetOfOneIntegers = null;
                }.getClass().getDeclaredField("nullableSetOfOneIntegers").getGenericType(),
                NullableSetOfOneIntegersValue3.class.getDeclaredField("nullableSetOfOneIntegers").getGenericType());
    }
}
