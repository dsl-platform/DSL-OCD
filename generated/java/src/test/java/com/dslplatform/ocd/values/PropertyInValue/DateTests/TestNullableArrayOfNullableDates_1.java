package com.dslplatform.ocd.values.PropertyInValue.DateTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableArrayOfNullableDates_1;

public class TestNullableArrayOfNullableDates_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableDates_1.class.getDeclaredField(
                        "nullableArrayOfNullableDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.LocalDate[].class,
                NullableArrayOfNullableDates_1.class.getDeclaredField(
                        "nullableArrayOfNullableDates").getType());
    }
}
