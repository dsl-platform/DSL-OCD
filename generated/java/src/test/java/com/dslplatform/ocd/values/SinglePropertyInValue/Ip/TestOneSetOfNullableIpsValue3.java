package com.dslplatform.ocd.values.SinglePropertyInValue.Ip;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableIpsValue3;
import org.scalatest._;

public class TestOneSetOfNullableIpsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableIpsValue3.class.getDeclaredField(
                        "oneSetOfNullableIps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableIpsValue3.class.getDeclaredField(
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
                OneSetOfNullableIpsValue3.class.getDeclaredField("oneSetOfNullableIps").getGenericType());
    }
}
