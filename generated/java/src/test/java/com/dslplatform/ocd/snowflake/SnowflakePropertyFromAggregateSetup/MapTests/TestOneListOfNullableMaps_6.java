package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.MapTests;

import com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneListOfNullableMaps_6;

public class TestOneListOfNullableMaps_6 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableMaps_6.class.getDeclaredField(
                        "oneListOfNullableMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableMaps_6.class.getDeclaredField(
                        "oneListOfNullableMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.util.Map<String, String>> oneListOfNullableMaps = null;
                }.getClass().getDeclaredField("oneListOfNullableMaps").getGenericType(),
                OneListOfNullableMaps_6.class.getDeclaredField("oneListOfNullableMaps").getGenericType());
    }
}
