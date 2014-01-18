package com.dslplatform.ocd.values.PropertyInValue.DateTests;

import com.dslplatform.ocd.values.PropertyInValue.OneListOfOneDates_1;

public class TestOneListOfOneDates_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneDates_1.class.getDeclaredField(
                        "oneListOfOneDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneDates_1.class.getDeclaredField(
                        "oneListOfOneDates").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<org.joda.time.LocalDate> oneListOfOneDates = null;
                }.getClass().getDeclaredField("oneListOfOneDates").getGenericType(),
                OneListOfOneDates_1.class.getDeclaredField("oneListOfOneDates").getGenericType());
    }
}
