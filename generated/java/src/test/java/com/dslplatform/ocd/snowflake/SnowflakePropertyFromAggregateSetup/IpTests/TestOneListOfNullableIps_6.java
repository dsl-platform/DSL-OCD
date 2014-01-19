package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.IpTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableIps_6;

public class TestOneListOfNullableIps_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableIps_6.class.getDeclaredField(
                        "oneListOfNullableIps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableIps_6.class.getDeclaredField(
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
                OneListOfNullableIps_6.class.getDeclaredField("oneListOfNullableIps").getGenericType());
    }
}
