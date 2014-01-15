package com.dslplatform.ocd.values.SinglePropertyInValue.DateTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneDatesValue2;

public class TestNullableListOfOneDatesValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneDatesValue2.class.getDeclaredField(
                        "nullableListOfOneDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneDatesValue2.class.getDeclaredField(
                        "nullableListOfOneDates").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<org.joda.time.LocalDate> nullableListOfOneDates = null;
                }.getClass().getDeclaredField("nullableListOfOneDates").getGenericType(),
                NullableListOfOneDatesValue2.class.getDeclaredField("nullableListOfOneDates").getGenericType());
    }
}
