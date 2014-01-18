package com.dslplatform.ocd.values.PropertyInValue.DateTests;

import com.dslplatform.ocd.values.PropertyInValue.OneListOfNullableDates_1;

public class TestOneListOfNullableDates_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableDates_1.class.getDeclaredField(
                        "oneListOfNullableDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableDates_1.class.getDeclaredField(
                        "oneListOfNullableDates").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<org.joda.time.LocalDate> oneListOfNullableDates = null;
                }.getClass().getDeclaredField("oneListOfNullableDates").getGenericType(),
                OneListOfNullableDates_1.class.getDeclaredField("oneListOfNullableDates").getGenericType());
    }
}
