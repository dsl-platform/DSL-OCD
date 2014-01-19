package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.TextTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableSetOfOneTexts_4;

public class TestNullableSetOfOneTexts_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneTexts_4.class.getDeclaredField(
                        "nullableSetOfOneTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneTexts_4.class.getDeclaredField(
                        "nullableSetOfOneTexts").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> nullableSetOfOneTexts = null;
                }.getClass().getDeclaredField("nullableSetOfOneTexts").getGenericType(),
                NullableSetOfOneTexts_4.class.getDeclaredField("nullableSetOfOneTexts").getGenericType());
    }
}
