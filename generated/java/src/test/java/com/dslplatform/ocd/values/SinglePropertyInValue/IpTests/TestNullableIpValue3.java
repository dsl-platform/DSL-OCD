package com.dslplatform.ocd.values.SinglePropertyInValue.IpTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableIpValue3;

public class TestNullableIpValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableIpValue3.class.getDeclaredField(
                        "nullableIp").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.InetAddress.class,
                NullableIpValue3.class.getDeclaredField(
                        "nullableIp").getType());
    }
}
