package com.dslplatform.ocd.values.SinglePropertyInValue.IpTests;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableIpsValue1;

public class TestOneSetOfNullableIpsValue1 {

    /* Testing the property field private access via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableIpsValue1.class.getDeclaredField(
                        "oneSetOfNullableIps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableIpsValue1.class.getDeclaredField(
                        "oneSetOfNullableIps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.net.InetAddress> oneSetOfNullableIps = null;
                }.getClass().getDeclaredField("oneSetOfNullableIps").getGenericType(),
                OneSetOfNullableIpsValue1.class.getDeclaredField("oneSetOfNullableIps").getGenericType());
    }
}
