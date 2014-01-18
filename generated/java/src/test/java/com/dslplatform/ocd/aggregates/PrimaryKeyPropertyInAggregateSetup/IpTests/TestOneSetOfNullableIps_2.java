package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.IpTests;

import com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableIps_2;

public class TestOneSetOfNullableIps_2 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableIps_2.class.getDeclaredField(
                        "oneSetOfNullableIps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableIps_2.class.getDeclaredField(
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
                OneSetOfNullableIps_2.class.getDeclaredField("oneSetOfNullableIps").getGenericType());
    }
}
