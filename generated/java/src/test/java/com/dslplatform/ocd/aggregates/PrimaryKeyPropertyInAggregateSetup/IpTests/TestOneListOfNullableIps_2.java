package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.IpTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableIps_2;

public class TestOneListOfNullableIps_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableIps_2.class.getDeclaredField(
                        "oneListOfNullableIps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableIps_2.class.getDeclaredField(
                        "oneListOfNullableIps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.net.InetAddress> oneListOfNullableIps = null;
                }.getClass().getDeclaredField("oneListOfNullableIps").getGenericType(),
                OneListOfNullableIps_2.class.getDeclaredField("oneListOfNullableIps").getGenericType());
    }
}
