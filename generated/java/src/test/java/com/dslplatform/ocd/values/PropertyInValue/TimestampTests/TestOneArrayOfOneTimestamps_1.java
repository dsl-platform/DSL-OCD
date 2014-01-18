package com.dslplatform.ocd.values.PropertyInValue.TimestampTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfOneTimestamps_1;

public class TestOneArrayOfOneTimestamps_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneTimestamps_1.class.getDeclaredField(
                        "oneArrayOfOneTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.DateTime[].class,
                OneArrayOfOneTimestamps_1.class.getDeclaredField(
                        "oneArrayOfOneTimestamps").getType());
    }
}
