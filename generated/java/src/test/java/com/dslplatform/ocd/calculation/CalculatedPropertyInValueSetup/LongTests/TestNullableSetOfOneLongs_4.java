package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.LongTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableSetOfOneLongs_4;

public class TestNullableSetOfOneLongs_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneLongs_4.class.getDeclaredField(
                        "nullableSetOfOneLongs").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneLongs_4.class.getDeclaredField(
                        "nullableSetOfOneLongs").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<Long> nullableSetOfOneLongs = null;
                }.getClass().getDeclaredField("nullableSetOfOneLongs").getGenericType(),
                NullableSetOfOneLongs_4.class.getDeclaredField("nullableSetOfOneLongs").getGenericType());
    }
}
