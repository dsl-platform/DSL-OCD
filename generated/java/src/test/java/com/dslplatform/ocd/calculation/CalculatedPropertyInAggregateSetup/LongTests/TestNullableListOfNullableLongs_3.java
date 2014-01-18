package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.LongTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableLongs_3;

public class TestNullableListOfNullableLongs_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableLongs_3.class.getDeclaredField(
                        "nullableListOfNullableLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableLongs_3.class.getDeclaredField(
                        "nullableListOfNullableLongs").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Long> nullableListOfNullableLongs = null;
                }.getClass().getDeclaredField("nullableListOfNullableLongs").getGenericType(),
                NullableListOfNullableLongs_3.class.getDeclaredField("nullableListOfNullableLongs").getGenericType());
    }
}
