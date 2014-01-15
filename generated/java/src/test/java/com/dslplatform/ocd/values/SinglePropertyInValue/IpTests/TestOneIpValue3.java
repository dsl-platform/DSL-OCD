package com.dslplatform.ocd.values.SinglePropertyInValue.IpTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneIpValue3;

public class TestOneIpValue3 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneIpValue3.class.getDeclaredField(
                        "oneIp").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.InetAddress.class,
                OneIpValue3.class.getDeclaredField(
                        "oneIp").getType());
    }
}
