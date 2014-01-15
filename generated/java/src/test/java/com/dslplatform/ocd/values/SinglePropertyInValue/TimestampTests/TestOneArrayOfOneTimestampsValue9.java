package com.dslplatform.ocd.values.SinglePropertyInValue.TimestampTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneTimestampsValue9;

public class TestOneArrayOfOneTimestampsValue9 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneTimestampsValue9.class.getDeclaredField(
                        "oneArrayOfOneTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.DateTime[].class,
                OneArrayOfOneTimestampsValue9.class.getDeclaredField(
                        "oneArrayOfOneTimestamps").getType());
    }
}
