package com.dslplatform.ocd.values.SinglePropertyInValue.Ip;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableIpsValue3;
import org.scalatest._;

public class TestNullableListOfNullableIpsValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableIpsValue3.class.getDeclaredField(
                        "nullableListOfNullableIps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableIpsValue3.class.getDeclaredField(
                        "nullableListOfNullableIps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.net.InetAddress> nullableListOfNullableIps = null;
                }.getClass().getDeclaredField("nullableListOfNullableIps").getGenericType(),
                NullableListOfNullableIpsValue3.class.getDeclaredField("nullableListOfNullableIps").getGenericType());
    }
}
