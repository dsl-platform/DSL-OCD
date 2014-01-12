package com.dslplatform.ocd.values.SinglePropertyInValue.Ip;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableIpsValue1;
import org.scalatest._;

public class TestNullableSetOfNullableIpsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableIpsValue1.class.getDeclaredField(
                        "nullableSetOfNullableIps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableIpsValue1.class.getDeclaredField(
                        "nullableSetOfNullableIps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.net.InetAddress> nullableSetOfNullableIps = null;
                }.getClass().getDeclaredField("nullableSetOfNullableIps").getGenericType(),
                NullableSetOfNullableIpsValue1.class.getDeclaredField("nullableSetOfNullableIps").getGenericType());
    }
}
