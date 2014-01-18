package com.dslplatform.ocd.values.PropertyInValue.DateTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableArrayOfOneDates_1;

public class TestNullableArrayOfOneDates_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneDates_1.class.getDeclaredField(
                        "nullableArrayOfOneDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.LocalDate[].class,
                NullableArrayOfOneDates_1.class.getDeclaredField(
                        "nullableArrayOfOneDates").getType());
    }
}
