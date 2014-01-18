package com.dslplatform.ocd.values.PropertyInValue.IpTests;

import com.dslplatform.ocd.values.PropertyInValue.OneSetOfOneIps_1;

public class TestOneSetOfOneIps_1 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneIps_1.class.getDeclaredField(
                        "oneSetOfOneIps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneIps_1.class.getDeclaredField(
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
                OneSetOfOneIps_1.class.getDeclaredField("oneSetOfOneIps").getGenericType());
    }
}
