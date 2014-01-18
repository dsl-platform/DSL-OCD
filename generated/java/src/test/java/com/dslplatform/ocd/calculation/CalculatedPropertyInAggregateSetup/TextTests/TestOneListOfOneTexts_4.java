package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.TextTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneTexts_4;

public class TestOneListOfOneTexts_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneTexts_4.class.getDeclaredField(
                        "oneListOfOneTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneTexts_4.class.getDeclaredField(
                        "oneListOfOneTexts").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<String> oneListOfOneTexts = null;
                }.getClass().getDeclaredField("oneListOfOneTexts").getGenericType(),
                OneListOfOneTexts_4.class.getDeclaredField("oneListOfOneTexts").getGenericType());
    }
}
