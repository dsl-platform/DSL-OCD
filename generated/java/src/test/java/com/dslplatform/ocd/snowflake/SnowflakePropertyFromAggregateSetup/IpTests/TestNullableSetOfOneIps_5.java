package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.IpTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneIps_5;

public class TestNullableSetOfOneIps_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOneIps_5.class.getDeclaredField(
                        "nullableSetOfOneIps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOneIps_5.class.getDeclaredField(
                        "nullableSetOfOneIps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.net.InetAddress> nullableSetOfOneIps = null;
                }.getClass().getDeclaredField("nullableSetOfOneIps").getGenericType(),
                NullableSetOfOneIps_5.class.getDeclaredField("nullableSetOfOneIps").getGenericType());
    }
}
