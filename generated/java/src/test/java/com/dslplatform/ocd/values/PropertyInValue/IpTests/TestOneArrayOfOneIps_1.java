package com.dslplatform.ocd.values.PropertyInValue.IpTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfOneIps_1;

public class TestOneArrayOfOneIps_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneIps_1.class.getDeclaredField(
                        "oneArrayOfOneIps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.InetAddress[].class,
                OneArrayOfOneIps_1.class.getDeclaredField(
                        "oneArrayOfOneIps").getType());
    }
}
