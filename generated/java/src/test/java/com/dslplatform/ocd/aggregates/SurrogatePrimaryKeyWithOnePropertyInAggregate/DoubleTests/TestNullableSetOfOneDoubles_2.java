package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.DoubleTests;

import com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfOneDoubles_2;

public class TestNullableSetOfOneDoubles_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneDoubles_2.class.getDeclaredField(
                        "nullableSetOfOneDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneDoubles_2.class.getDeclaredField(
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
                NullableSetOfOneDoubles_2.class.getDeclaredField("nullableSetOfOneDoubles").getGenericType());
    }
}