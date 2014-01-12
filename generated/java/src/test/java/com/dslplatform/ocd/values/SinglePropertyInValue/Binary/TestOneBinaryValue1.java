package com.dslplatform.ocd.values.SinglePropertyInValue.Binary;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneBinaryValue1;
import org.scalatest._;

public class TestOneBinaryValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneBinaryValue1.class.getDeclaredField(
                        "oneBinary").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                byte[].class,
                OneBinaryValue1.class.getDeclaredField(
                        "oneBinary").getType());
    }
}
