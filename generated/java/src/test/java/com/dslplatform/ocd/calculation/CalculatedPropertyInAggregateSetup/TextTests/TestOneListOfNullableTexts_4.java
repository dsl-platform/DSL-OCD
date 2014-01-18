package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.TextTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableTexts_4;

public class TestOneListOfNullableTexts_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableTexts_4.class.getDeclaredField(
                        "oneListOfNullableTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableTexts_4.class.getDeclaredField(
                        "oneListOfNullableTexts").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<String> oneListOfNullableTexts = null;
                }.getClass().getDeclaredField("oneListOfNullableTexts").getGenericType(),
                OneListOfNullableTexts_4.class.getDeclaredField("oneListOfNullableTexts").getGenericType());
    }
}
