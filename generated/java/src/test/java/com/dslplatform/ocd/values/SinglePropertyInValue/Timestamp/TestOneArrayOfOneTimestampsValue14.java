package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneTimestampsValue14;
import org.scalatest._;

public class TestOneArrayOfOneTimestampsValue14 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneTimestampsValue14.class.getDeclaredField(
                        "oneArrayOfOneTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.DateTime[].class,
                OneArrayOfOneTimestampsValue14.class.getDeclaredField(
                        "oneArrayOfOneTimestamps").getType());
    }
}
