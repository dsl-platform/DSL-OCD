package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneTimestampValue4;
import org.scalatest._;

public class TestOneTimestampValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneTimestampValue4.class.getDeclaredField(
                        "oneTimestamp").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.DateTime.class,
                OneTimestampValue4.class.getDeclaredField(
                        "oneTimestamp").getType());
    }
}
