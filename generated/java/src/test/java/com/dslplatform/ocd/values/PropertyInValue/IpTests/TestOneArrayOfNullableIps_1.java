package com.dslplatform.ocd.values.PropertyInValue.IpTests;

import com.dslplatform.ocd.values.PropertyInValue.OneArrayOfNullableIps_1;

public class TestOneArrayOfNullableIps_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfNullableIps_1.class.getDeclaredField(
                        "oneArrayOfNullableIps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.InetAddress[].class,
                OneArrayOfNullableIps_1.class.getDeclaredField(
                        "oneArrayOfNullableIps").getType());
    }
}
