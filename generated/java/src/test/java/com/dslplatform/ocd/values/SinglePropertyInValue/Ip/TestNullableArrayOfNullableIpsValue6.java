package com.dslplatform.ocd.values.SinglePropertyInValue.Ip;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableIpsValue6;
import org.scalatest._;

public class TestNullableArrayOfNullableIpsValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableIpsValue6.class.getDeclaredField(
                        "nullableArrayOfNullableIps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.InetAddress[].class,
                NullableArrayOfNullableIpsValue6.class.getDeclaredField(
                        "nullableArrayOfNullableIps").getType());
    }
}
