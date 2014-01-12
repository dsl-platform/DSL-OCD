package com.dslplatform.ocd.values.SinglePropertyInValue.Ip;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableIpsValue6;
import org.scalatest._;

public class TestOneArrayOfNullableIpsValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableIpsValue6.class.getDeclaredField(
                        "oneArrayOfNullableIps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.InetAddress[].class,
                OneArrayOfNullableIpsValue6.class.getDeclaredField(
                        "oneArrayOfNullableIps").getType());
    }
}
