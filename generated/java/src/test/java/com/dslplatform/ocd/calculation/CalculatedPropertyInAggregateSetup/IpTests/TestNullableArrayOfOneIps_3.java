package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.IpTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneIps_3;

public class TestNullableArrayOfOneIps_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneIps_3.class.getDeclaredField(
                        "nullableArrayOfOneIps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.net.InetAddress[].class,
                NullableArrayOfOneIps_3.class.getDeclaredField(
                        "nullableArrayOfOneIps").getType());
    }
}
