package com.dslplatform.ocd.values.SinglePropertyInValue.Double;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableDoublesValue2;
import org.scalatest._;

public class TestNullableSetOfNullableDoublesValue2 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableDoublesValue2.class.getDeclaredField(
                        "nullableSetOfNullableDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableDoublesValue2.class.getDeclaredField(
                        "nullableSetOfNullableDoubles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Double> nullableSetOfNullableDoubles = null;
                }.getClass().getDeclaredField("nullableSetOfNullableDoubles").getGenericType(),
                NullableSetOfNullableDoublesValue2.class.getDeclaredField("nullableSetOfNullableDoubles").getGenericType());
    }
}
