package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.TimestampTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableArrayOfOneTimestamps_4;

public class TestNullableArrayOfOneTimestamps_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneTimestamps_4.class.getDeclaredField(
                        "nullableArrayOfOneTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.DateTime[].class,
                NullableArrayOfOneTimestamps_4.class.getDeclaredField(
                        "nullableArrayOfOneTimestamps").getType());
    }
}
