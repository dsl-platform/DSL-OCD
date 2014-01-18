package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.IpTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneIp_4;

public class TestOneIp_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneIp_4.class.getDeclaredField(
                        "oneIp").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.InetAddress.class,
                OneIp_4.class.getDeclaredField(
                        "oneIp").getType());
    }
}
