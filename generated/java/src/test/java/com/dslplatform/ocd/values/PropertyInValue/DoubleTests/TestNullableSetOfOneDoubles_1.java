package com.dslplatform.ocd.values.PropertyInValue.DoubleTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableSetOfOneDoubles_1;

public class TestNullableSetOfOneDoubles_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneDoubles_1.class.getDeclaredField(
                        "nullableSetOfOneDoubles").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneDoubles_1.class.getDeclaredField(
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
                NullableSetOfOneDoubles_1.class.getDeclaredField("nullableSetOfOneDoubles").getGenericType());
    }
}
