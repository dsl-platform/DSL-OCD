package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.IpTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneIps_4;

public class TestOneSetOfOneIps_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneIps_4.class.getDeclaredField(
                        "oneSetOfOneIps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneIps_4.class.getDeclaredField(
                        "oneSetOfOneIps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.net.InetAddress> oneSetOfOneIps = null;
                }.getClass().getDeclaredField("oneSetOfOneIps").getGenericType(),
                OneSetOfOneIps_4.class.getDeclaredField("oneSetOfOneIps").getGenericType());
    }
}
