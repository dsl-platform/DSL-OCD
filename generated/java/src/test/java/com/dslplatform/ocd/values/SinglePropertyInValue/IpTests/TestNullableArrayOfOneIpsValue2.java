package com.dslplatform.ocd.values.SinglePropertyInValue.IpTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneIpsValue2;

public class TestNullableArrayOfOneIpsValue2 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneIpsValue2.class.getDeclaredField(
                        "nullableArrayOfOneIps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.InetAddress[].class,
                NullableArrayOfOneIpsValue2.class.getDeclaredField(
                        "nullableArrayOfOneIps").getType());
    }
}
