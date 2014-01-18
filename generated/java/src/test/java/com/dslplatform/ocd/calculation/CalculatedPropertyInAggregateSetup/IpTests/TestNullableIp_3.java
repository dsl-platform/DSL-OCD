package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.IpTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableIp_3;

public class TestNullableIp_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableIp_3.class.getDeclaredField(
                        "nullableIp").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.InetAddress.class,
                NullableIp_3.class.getDeclaredField(
                        "nullableIp").getType());
    }
}
