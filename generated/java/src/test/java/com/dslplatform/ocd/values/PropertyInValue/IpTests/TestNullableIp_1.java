package com.dslplatform.ocd.values.PropertyInValue.IpTests;

import com.dslplatform.ocd.values.PropertyInValue.NullableIp_1;

public class TestNullableIp_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableIp_1.class.getDeclaredField(
                        "nullableIp").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.InetAddress.class,
                NullableIp_1.class.getDeclaredField(
                        "nullableIp").getType());
    }
}
