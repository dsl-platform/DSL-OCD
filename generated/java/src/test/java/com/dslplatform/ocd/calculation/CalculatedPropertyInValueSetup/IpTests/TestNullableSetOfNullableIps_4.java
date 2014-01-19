package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.IpTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup.NullableSetOfNullableIps_4;

public class TestNullableSetOfNullableIps_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableIps_4.class.getDeclaredField(
                        "nullableSetOfNullableIps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableIps_4.class.getDeclaredField(
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
                NullableSetOfNullableIps_4.class.getDeclaredField("nullableSetOfNullableIps").getGenericType());
    }
}
