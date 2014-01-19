package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.GuidTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfOneGuids_6;

public class TestOneListOfOneGuids_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfOneGuids_6.class.getDeclaredField(
                        "oneListOfOneGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfOneGuids_6.class.getDeclaredField(
                        "oneListOfOneGuids").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.util.UUID> oneListOfOneGuids = null;
                }.getClass().getDeclaredField("oneListOfOneGuids").getGenericType(),
                OneListOfOneGuids_6.class.getDeclaredField("oneListOfOneGuids").getGenericType());
    }
}
