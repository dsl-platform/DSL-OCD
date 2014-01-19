package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.IpTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneIps_5;

public class TestNullableListOfOneIps_5 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneIps_5.class.getDeclaredField(
                        "nullableListOfOneIps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneIps_5.class.getDeclaredField(
                        "nullableListOfOneIps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.net.InetAddress> nullableListOfOneIps = null;
                }.getClass().getDeclaredField("nullableListOfOneIps").getGenericType(),
                NullableListOfOneIps_5.class.getDeclaredField("nullableListOfOneIps").getGenericType());
    }
}
