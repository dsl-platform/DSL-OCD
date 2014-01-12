package com.dslplatform.ocd.values.SinglePropertyInValue.Double;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableDoublesValue1;
import org.scalatest._;

public class TestOneListOfNullableDoublesValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableDoublesValue1.class.getDeclaredField(
                        "oneListOfNullableDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableDoublesValue1.class.getDeclaredField(
                        "oneListOfNullableDoubles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Double> oneListOfNullableDoubles = null;
                }.getClass().getDeclaredField("oneListOfNullableDoubles").getGenericType(),
                OneListOfNullableDoublesValue1.class.getDeclaredField("oneListOfNullableDoubles").getGenericType());
    }
}
