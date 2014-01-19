package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.TextTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableListOfNullableTexts_4;

public class TestNullableListOfNullableTexts_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableTexts_4.class.getDeclaredField(
                        "nullableListOfNullableTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableTexts_4.class.getDeclaredField(
                        "nullableListOfNullableTexts").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<String> nullableListOfNullableTexts = null;
                }.getClass().getDeclaredField("nullableListOfNullableTexts").getGenericType(),
                NullableListOfNullableTexts_4.class.getDeclaredField("nullableListOfNullableTexts").getGenericType());
    }
}
