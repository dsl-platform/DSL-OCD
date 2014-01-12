package com.dslplatform.ocd.values.SinglePropertyInValue.Guid;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneGuidsValue7;
import org.scalatest._;

public class TestOneArrayOfOneGuidsValue7 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneGuidsValue7.class.getDeclaredField(
                        "oneArrayOfOneGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.UUID[].class,
                OneArrayOfOneGuidsValue7.class.getDeclaredField(
                        "oneArrayOfOneGuids").getType());
    }
}
