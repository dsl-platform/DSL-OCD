package com.dslplatform.ocd.values.SinglePropertyInValue.Double;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneDoublesValue3;
import org.scalatest._;

public class TestNullableListOfOneDoublesValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneDoublesValue3.class.getDeclaredField(
                        "nullableListOfOneDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneDoublesValue3.class.getDeclaredField(
                        "nullableListOfOneDoubles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Double> nullableListOfOneDoubles = null;
                }.getClass().getDeclaredField("nullableListOfOneDoubles").getGenericType(),
                NullableListOfOneDoublesValue3.class.getDeclaredField("nullableListOfOneDoubles").getGenericType());
    }
}
