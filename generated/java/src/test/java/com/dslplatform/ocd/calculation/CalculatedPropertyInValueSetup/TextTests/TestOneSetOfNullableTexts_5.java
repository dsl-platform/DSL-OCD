package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.TextTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.OneSetOfNullableTexts_5;

public class TestOneSetOfNullableTexts_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableTexts_5.class.getDeclaredField(
                        "oneSetOfNullableTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableTexts_5.class.getDeclaredField(
                        "oneSetOfNullableTexts").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> oneSetOfNullableTexts = null;
                }.getClass().getDeclaredField("oneSetOfNullableTexts").getGenericType(),
                OneSetOfNullableTexts_5.class.getDeclaredField("oneSetOfNullableTexts").getGenericType());
    }
}
