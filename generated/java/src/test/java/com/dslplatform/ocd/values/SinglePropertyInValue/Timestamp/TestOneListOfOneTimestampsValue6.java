package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneTimestampsValue6;
import org.scalatest._;

public class TestOneListOfOneTimestampsValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneTimestampsValue6.class.getDeclaredField(
                        "oneListOfOneTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneTimestampsValue6.class.getDeclaredField(
                        "oneListOfOneTimestamps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<org.joda.time.DateTime> oneListOfOneTimestamps = null;
                }.getClass().getDeclaredField("oneListOfOneTimestamps").getGenericType(),
                OneListOfOneTimestampsValue6.class.getDeclaredField("oneListOfOneTimestamps").getGenericType());
    }
}
