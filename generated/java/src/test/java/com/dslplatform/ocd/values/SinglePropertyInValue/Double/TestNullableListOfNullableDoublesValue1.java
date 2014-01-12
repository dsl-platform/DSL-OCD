package com.dslplatform.ocd.values.SinglePropertyInValue.Double;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableDoublesValue1;

public class TestNullableListOfNullableDoublesValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableDoublesValue1.class.getDeclaredField(
                        "nullableListOfNullableDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableDoublesValue1.class.getDeclaredField(
                        "nullableListOfNullableDoubles").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Double> nullableListOfNullableDoubles = null;
                }.getClass().getDeclaredField("nullableListOfNullableDoubles").getGenericType(),
                NullableListOfNullableDoublesValue1.class.getDeclaredField("nullableListOfNullableDoubles").getGenericType());
    }
}
