package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.IpTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneIps_6;

public class TestOneListOfOneIps_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneIps_6.class.getDeclaredField(
                        "oneListOfOneIps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneIps_6.class.getDeclaredField(
                        "oneListOfOneIps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.net.InetAddress> oneListOfOneIps = null;
                }.getClass().getDeclaredField("oneListOfOneIps").getGenericType(),
                OneListOfOneIps_6.class.getDeclaredField("oneListOfOneIps").getGenericType());
    }
}
