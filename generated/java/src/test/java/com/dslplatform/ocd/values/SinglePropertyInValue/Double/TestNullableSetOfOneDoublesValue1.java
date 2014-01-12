package com.dslplatform.ocd.values.SinglePropertyInValue.Double;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneDoublesValue1;
import org.scalatest._;

public class TestNullableSetOfOneDoublesValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneDoublesValue1.class.getDeclaredField(
                        "nullableSetOfOneDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneDoublesValue1.class.getDeclaredField(
                        "nullableSetOfOneDoubles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Double> nullableSetOfOneDoubles = null;
                }.getClass().getDeclaredField("nullableSetOfOneDoubles").getGenericType(),
                NullableSetOfOneDoublesValue1.class.getDeclaredField("nullableSetOfOneDoubles").getGenericType());
    }
}
