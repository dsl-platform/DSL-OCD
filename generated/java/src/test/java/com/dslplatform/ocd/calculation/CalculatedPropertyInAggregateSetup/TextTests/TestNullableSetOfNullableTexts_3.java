package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.TextTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableTexts_3;

public class TestNullableSetOfNullableTexts_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableTexts_3.class.getDeclaredField(
                        "nullableSetOfNullableTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableTexts_3.class.getDeclaredField(
                        "nullableSetOfNullableTexts").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> nullableSetOfNullableTexts = null;
                }.getClass().getDeclaredField("nullableSetOfNullableTexts").getGenericType(),
                NullableSetOfNullableTexts_3.class.getDeclaredField("nullableSetOfNullableTexts").getGenericType());
    }
}
