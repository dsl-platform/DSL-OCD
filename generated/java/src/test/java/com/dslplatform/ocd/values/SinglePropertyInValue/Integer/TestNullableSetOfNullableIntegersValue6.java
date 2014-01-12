package com.dslplatform.ocd.values.SinglePropertyInValue.Integer;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableIntegersValue6;
import org.scalatest._;

public class TestNullableSetOfNullableIntegersValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableIntegersValue6.class.getDeclaredField(
                        "nullableSetOfNullableIntegers").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableIntegersValue6.class.getDeclaredField(
                        "nullableSetOfNullableIntegers").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Integer> nullableSetOfNullableIntegers = null;
                }.getClass().getDeclaredField("nullableSetOfNullableIntegers").getGenericType(),
                NullableSetOfNullableIntegersValue6.class.getDeclaredField("nullableSetOfNullableIntegers").getGenericType());
    }
}
